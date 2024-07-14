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
@Table(name = "distribution")
public class Distribution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "distribution_code", unique = true, length = 10, nullable = false)
    private String distributionCode;

    @Column(name = "distribution_name", length = 20, nullable = false)
    private String distributionName;

    @Column(name = "receipt_date")
    private String receiptDate;
    
    @Column(name = "order_qty")
    private Integer orderQty;

    @Column(name = "initial_qty")
    private Integer initialQty;

    @Column(name = "received_qty")
    private Integer receivedQty;

    @Column(name = "release_qty")
    private Integer releaseQty;

    @Column(name = "current_qty")
    private Integer currentQty;
    
    @Column(name = "expected_receipt_date", length = 30)
    private String expectedReceiptDate;

    // 기본 생성자
    public Distribution() {}

    // 생성자
    public Distribution(String distributionCode, String distributionName, String receiptDate, Integer orderQty,
            Integer initialQty, Integer receivedQty, Integer releaseQty, Integer currentQty, String expectedReceiptDate) {
        this.distributionCode = distributionCode;
        this.distributionName = distributionName;
        this.receiptDate = receiptDate;
        this.orderQty = orderQty;
        this.initialQty = initialQty;
        this.receivedQty = receivedQty;
        this.releaseQty = releaseQty;
        this.currentQty = currentQty;
        this.expectedReceiptDate = expectedReceiptDate;
    }

    // Getter 및 Setter (생략 가능)
}
