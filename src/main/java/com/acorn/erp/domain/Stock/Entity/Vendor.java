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
@Table(name = "vendor")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendorCode;

    @Column(name = "vendor_name", length = 50)
    private String vendorName;

    @Column(name = "vendor_contact", length = 18)
    private String vendorContact;

    @Column(name = "vendor_address", length = 90)
    private String vendorAddress;

    @Column(name = "vendor_remark", length = 300)
    private String vendorRemark;

    @Column(name = "deliverable_status")
    private boolean deliverableStatus;

    // 기본 생성자
    public Vendor() {}

    // 생성자
    public Vendor(String vendorName, String vendorContact, String vendorAddress, String vendorRemark, boolean deliverableStatus) {
        this.vendorName = vendorName;
        this.vendorContact = vendorContact;
        this.vendorAddress = vendorAddress;
        this.vendorRemark = vendorRemark;
        this.deliverableStatus = deliverableStatus;
    }

    // Getter 및 Setter (생략 가능)
}
