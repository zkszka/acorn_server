package com.acorn.erp.domain.Sales.Entity;

import java.sql.Date;

import com.acorn.erp.domain.Customer.Entity.CustomerInfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "SALES_RETURN")
public class ReturnTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private Long no;

    @Column(name = "order_num", nullable = false)
    private Long orderNum;

    @Column(name = "return_type", length = 10)
    private String returnType;

    @ManyToOne
    @JoinColumn(name = "item_name")
    private ItemTable itemTable;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerInfo customerInfo;

    @Column(name = "return_qty")
    private Integer returnQty;

    @Column(name = "return_total_price")
    private Long returnTotalPrice;

    @Column(name = "return_date")
    @Temporal(TemporalType.DATE)
    private Date returnDate;

    @Column(name = "return_reason", length = 300)
    private String returnReason;

    @Column(name = "return_status", length = 10)
    private String returnStatus;

    // 기본 생성자
    public ReturnTable() {}

    // 생성자
    public ReturnTable(Long orderNum, String returnType, ItemTable itemTable, CustomerInfo customerInfo, Integer returnQty,
            Long returnTotalPrice, Date returnDate, String returnReason, String returnStatus) {
        this.orderNum = orderNum;
        this.returnType = returnType;
        this.itemTable = itemTable;
        this.customerInfo = customerInfo;
        this.returnQty = returnQty;
        this.returnTotalPrice = returnTotalPrice;
        this.returnDate = returnDate;
        this.returnReason = returnReason;
        this.returnStatus = returnStatus;
    }

    // Getter 및 Setter (생략 가능)
}
