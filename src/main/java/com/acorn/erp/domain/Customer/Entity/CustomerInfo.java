package com.acorn.erp.domain.Customer.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CUSTOMER_INFO")
@Getter
@Setter
@NoArgsConstructor // Lombok을 사용하여 기본 생성자 생성
public class CustomerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL에서는 IDENTITY 전략을 사용합니다.
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_name", length = 30)
    private String customerName;

    @Column(name = "customer_gender")
    private String customerGender;

    @Column(name = "customer_birth_date")
    private Date customerBirthDate;

    @Column(name = "customer_addr")
    private String customerAddr;

    @Column(name = "customer_tel")
    private String customerTel;

    @Column(name = "register_date")
    private Date registerDate;

    // 생성자, Getter, Setter, toString 등은 Lombok의 어노테이션에 의해 자동 생성됩니다.

    @Override
    public String toString() {
        return "CustomerInfo [customerId=" + customerId + ", customerName=" + customerName + ", customerGender="
                + customerGender + ", customerBirthDate=" + customerBirthDate + ", customerAddr=" + customerAddr
                + ", customerTel=" + customerTel + ", registerDate=" + registerDate + "]";
    }

    public CustomerInfo(String customerName, String customerGender, Date customerBirthDate, String customerAddr,
            String customerTel, Date registerDate) {
        this.customerName = customerName;
        this.customerGender = customerGender;
        this.customerBirthDate = customerBirthDate;
        this.customerAddr = customerAddr;
        this.customerTel = customerTel;
        this.registerDate = registerDate;
    }
}
