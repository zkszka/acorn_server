package com.acorn.erp.domain.Login.Repository;

import com.acorn.erp.domain.Login.Entity.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    @Select("SELECT * FROM user_info")
    List<UserInfo> getAllUserInfo();

    @Select("SELECT * FROM user_info WHERE registrationNum = #{registrationNum} AND email = #{email}")
    UserInfo getFindPw(@Param("registrationNum") String registrationNum, @Param("email") String email);

    @Select("SELECT * FROM user_info WHERE email = #{email}")
    UserInfo getUserByEmail(String email);

    @Insert("INSERT INTO user_info(email, password, shop_name, registration_num) " +
            "VALUES(#{email}, #{password}, #{shopName}, #{registrationNum})")
    void insertUserInfo(UserInfo userInfo);

    @Delete("DELETE FROM user_info WHERE email = #{email}")
    void deleteUserInfo(String email);

    @Update("UPDATE user_info SET password = #{password}, shop_name = #{shopName}, registration_num = #{registrationNum} " +
            "WHERE email = #{email}")
    void updateUserInfo(UserInfo userInfo);

    // 로그인 구현
    @Select("SELECT * FROM user_info WHERE email = #{email} AND password = #{password}")
    UserInfo getUserByEmailAndPassword(@Param("email") String email, @Param("password") String password);

    @Select("SELECT shop_name FROM user_info WHERE email = #{email}")
    String getShopName(String email);
}
