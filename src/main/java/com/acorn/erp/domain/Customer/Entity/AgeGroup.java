package com.acorn.erp.domain.Customer.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Entity
@Table(name = "AGE_GROUP", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"customer_id", "age_group"})
})
@Data // Lombok을 사용하여 Getter, Setter, toString 등을 자동 생성합니다.
public class AgeGroup {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "age_group_seq")
    @SequenceGenerator(name = "age_group_seq", sequenceName = "age_group_seq", allocationSize = 1)
    @Column(name = "age_group_id")
    private int ageGroupId;

    @Column(name = "customer_id", nullable = false)
    private int customerId;

    @Column(name = "age_group")
    private String ageGroup;

    // 생성자를 비워두면 기본 생성자가 자동으로 생성됩니다.
    // 다른 생성자가 필요한 경우에만 직접 추가합니다.

    @Override
    public String toString() {
        return "AgeGroup [ageGroupId=" + ageGroupId + ", customerId=" + customerId + ", ageGroup=" + ageGroup + "]";
    }
}
