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
@Table(name = "purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseCode;

    @Column(name = "purchase_unit", length = 20)
    private String purchaseUnit;

    @Column(name = "purchase_name", length = 21)
    private String purchaseName;

    @Column(name = "order_date")
    private String orderDate;

    @Column(name = "order_qty")
    private Long orderQty;

    @Column(name = "price")
    private Long price;

    @Column(name = "remark", length = 300)
    private String remark;

    // 기본 생성자
    public Purchase() {}

    // 생성자
    public Purchase(String purchaseUnit, String purchaseName, String orderDate, Long orderQty, Long price, String remark) {
        this.purchaseUnit = purchaseUnit;
        this.purchaseName = purchaseName;
        this.orderDate = orderDate;
        this.orderQty = orderQty;
        this.price = price;
        this.remark = remark;
    }

    // Getter 및 Setter (생략 가능)
}
