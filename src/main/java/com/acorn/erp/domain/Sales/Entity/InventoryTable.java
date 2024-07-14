package com.acorn.erp.domain.Sales.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory_table")
public class InventoryTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private Long no;
    
    @Column(name = "item_code", nullable = false)
    private Long itemCode;

    @Column(name = "item_name", length = 30, nullable = false)
    private String itemName;

    @Column(name = "item_qty")
    private Integer itemQty;

    @Column(name = "stock_out")
    private Integer stockOut;

    @Column(name = "stock_qty")
    private Integer stockQty;
    
    // 기본 생성자
    public InventoryTable() {}

    // Getter 및 Setter (일부 생략 가능)

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public Long getItemCode() {
        return itemCode;
    }

    public void setItemCode(Long itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemQty() {
        return itemQty;
    }

    public void setItemQty(Integer itemQty) {
        this.itemQty = itemQty;
    }

    public Integer getStockOut() {
        return stockOut;
    }

    public void setStockOut(Integer stockOut) {
        this.stockOut = stockOut;
    }

    public Integer getStockQty() {
        return stockQty;
    }

    public void setStockQty(Integer stockQty) {
        this.stockQty = stockQty;
    }
    
    // calculateStockQty 메서드 추가
    public void calculateStockQty() {
        this.stockQty = this.itemQty - this.stockOut;
    }
}
