package com.acorn.erp.domain.Customer.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(
    name = "CUSTOMER_TRANSACTION_INFO",
    uniqueConstraints = {@UniqueConstraint(columnNames = {"customerId", "transactionInfoId"})}
)
public class CustomerTransactionInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL에서는 IDENTITY 전략을 사용합니다.
    @Column(name = "transactionInfoId")
    private int transactionInfoId;

    @Column(nullable = false)
    private int customerId;

    private String customerName;

    @Column(name = "lastTransactionDate")
    private LocalDateTime lastTransactionDate;

    @Column(name = "totalAmountForCustomer")
    private int totalAmountForCustomer;

    @Column(name = "topSellingProduct")
    private String topSellingProduct;

    @Column(name = "totalCountForCustomer")
    private int totalCountForCustomer;

    @Column(name = "mostPurchasedProduct")
    private String mostPurchasedProduct;

    @Column(name = "prevRank_amount")
    private Integer prevRank_amount;

    @Column(name = "prevRank_count")
    private Integer prevRank_count;

    public CustomerTransactionInfo() {
    }

    public int getTransactionInfoId() {
        return transactionInfoId;
    }

    public void setTransactionInfoId(int transactionInfoId) {
        this.transactionInfoId = transactionInfoId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDateTime getLastTransactionDate() {
        return lastTransactionDate;
    }

    public void setLastTransactionDate(LocalDateTime lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }

    public int getTotalAmountForCustomer() {
        return totalAmountForCustomer;
    }

    public void setTotalAmountForCustomer(int totalAmountForCustomer) {
        this.totalAmountForCustomer = totalAmountForCustomer;
    }

    public String getTopSellingProduct() {
        return topSellingProduct;
    }

    public void setTopSellingProduct(String topSellingProduct) {
        this.topSellingProduct = topSellingProduct;
    }

    public int getTotalCountForCustomer() {
        return totalCountForCustomer;
    }

    public void setTotalCountForCustomer(int totalCountForCustomer) {
        this.totalCountForCustomer = totalCountForCustomer;
    }

    public String getMostPurchasedProduct() {
        return mostPurchasedProduct;
    }

    public void setMostPurchasedProduct(String mostPurchasedProduct) {
        this.mostPurchasedProduct = mostPurchasedProduct;
    }

    public Integer getPrevRank_amount() {
        return prevRank_amount;
    }

    public void setPrevRank_amount(Integer prevRank_amount) {
        this.prevRank_amount = prevRank_amount;
    }

    public Integer getPrevRank_count() {
        return prevRank_count;
    }

    public void setPrevRank_count(Integer prevRank_count) {
        this.prevRank_count = prevRank_count;
    }

    @Override
    public String toString() {
        return "CustomerTransactionInfo{" +
                "transactionInfoId=" + transactionInfoId +
                ", customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", lastTransactionDate=" + lastTransactionDate +
                ", totalAmountForCustomer=" + totalAmountForCustomer +
                ", topSellingProduct='" + topSellingProduct + '\'' +
                ", totalCountForCustomer=" + totalCountForCustomer +
                ", mostPurchasedProduct='" + mostPurchasedProduct + '\'' +
                ", prevRank_amount=" + prevRank_amount +
                ", prevRank_count=" + prevRank_count +
                '}';
    }
}
