package com.acorn.erp.domain.Customer.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Entity
@Table(
    name = "CUSTOMER_GRADE",
    uniqueConstraints = {@UniqueConstraint(columnNames = {"customer_id", "customer_grade"})}
)
@Data // Lombok을 사용하여 Getter, Setter, toString 등을 자동 생성합니다.
public class CustomerGrade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL에서는 IDENTITY 전략을 사용합니다.
    @Column(name = "grade_id")
    private int gradeId;
    
    @Column(name = "customer_id", nullable = false)
    private int customerId;
    
    @Column(name = "customer_grade")
    private String customerGrade = "일반"; // 기본값으로 "일반"을 설정합니다.
    
    // 생성자, Getter, Setter, toString 등은 Lombok의 @Data 어노테이션에 의해 자동 생성됩니다.
    public CustomerGrade() {
    }
    
    public CustomerGrade(Integer customerId) {
        this.customerId = customerId;
    }
}
