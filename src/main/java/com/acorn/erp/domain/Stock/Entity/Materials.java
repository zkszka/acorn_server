package com.acorn.erp.domain.Stock.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "materials")
public class Materials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "materials_code", unique = true, length = 10, nullable = false)
    private String materialsCode;

    @Column(name = "materials_name", length = 20, nullable = false)
    private String materialsName;
    
    @Column(name = "receipt_date")
    private String receiptDate;

    @Column(name = "quantity")
    private Integer quantity;

    // 기본 생성자
    public Materials() {}

    // 생성자
    public Materials(String materialsCode, String materialsName, String receiptDate, Integer quantity) {
        this.materialsCode = materialsCode;
        this.materialsName = materialsName;
        this.receiptDate = receiptDate;
        this.quantity = quantity;
    }

    // Getter 및 Setter (생략 가능)
}
