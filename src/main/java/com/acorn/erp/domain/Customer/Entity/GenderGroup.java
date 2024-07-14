package com.acorn.erp.domain.Customer.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(
    name = "Gender_GROUP",
    uniqueConstraints = {@UniqueConstraint(columnNames = {"customerId", "genderGroup"})}
)
public class GenderGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL에서는 IDENTITY 전략을 사용합니다.
    @Column(name = "gendergroupId")
    private int gendergroupId;

    @Column(nullable = false)
    private int customerId;

    @Column(name = "genderGroup")
    private String genderGroup;

    public GenderGroup() {
    }

    public GenderGroup(int customerId, String genderGroup) {
        this.customerId = customerId;
        this.genderGroup = genderGroup;
    }

    public int getGendergroupId() {
        return gendergroupId;
    }

    public void setGendergroupId(int gendergroupId) {
        this.gendergroupId = gendergroupId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getGenderGroup() {
        return genderGroup;
    }

    public void setGenderGroup(String genderGroup) {
        this.genderGroup = genderGroup;
    }

    @Override
    public String toString() {
        return "GenderGroup{" +
                "gendergroupId=" + gendergroupId +
                ", customerId=" + customerId +
                ", genderGroup='" + genderGroup + '\'' +
                '}';
    }
}
