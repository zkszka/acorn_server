package com.acorn.erp.domain.Login.Service;

import com.acorn.erp.domain.Login.Entity.UserInfo;
import com.acorn.erp.domain.Login.Repository.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {

    private final UserInfoMapper userInfoMapper;

    @Autowired
    public UserInfoService(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    public List<UserInfo> getAllUserInfo() {
        return userInfoMapper.getAllUserInfo();
    }

    public void insertUserInfo(UserInfo userInfo) {
        userInfoMapper.insertUserInfo(userInfo);
    }

    public void deleteUserInfo(String email) {
        userInfoMapper.deleteUserInfo(email);
    }

    public void updateUserInfo(UserInfo userInfo) {
        userInfoMapper.updateUserInfo(userInfo);
        System.out.println("업데이트 성공");
    }

    public UserInfo login(String email, String password) {
        return userInfoMapper.getUserByEmailAndPassword(email, password);
    }

    public String getShopname(String email) {
        return userInfoMapper.getShopName(email);
    }
}
