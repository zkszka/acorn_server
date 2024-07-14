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
    name = "REGION_GROUP",
    uniqueConstraints = {@UniqueConstraint(columnNames = {"customerId", "regiongroupProvince"})}
)
public class RegionGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL에서는 IDENTITY 전략을 사용합니다.
    @Column(name = "regiongroupId")
    private int regiongroupId;

    @Column(nullable = false)
    private int customerId;

    @Column(name = "regiongroupProvince")
    private String regiongroupProvince;

    @Column(name = "regiongroupCity")
    private String regiongroupCity;

    @Column(name = "regiongroupTown")
    private String regiongroupTown;

    public RegionGroup() {
    }

    public RegionGroup(int customerId, String regiongroupProvince, String regiongroupCity, String regiongroupTown) {
        this.customerId = customerId;
        this.regiongroupProvince = regiongroupProvince;
        this.regiongroupCity = regiongroupCity;
        this.regiongroupTown = regiongroupTown;
    }

    public int getRegiongroupId() {
        return regiongroupId;
    }

    public void setRegiongroupId(int regiongroupId) {
        this.regiongroupId = regiongroupId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getRegiongroupProvince() {
        return regiongroupProvince;
    }

    public void setRegiongroupProvince(String regiongroupProvince) {
        this.regiongroupProvince = regiongroupProvince;
    }

    public String getRegiongroupCity() {
        return regiongroupCity;
    }

    public void setRegiongroupCity(String regiongroupCity) {
        this.regiongroupCity = regiongroupCity;
    }

    public String getRegiongroupTown() {
        return regiongroupTown;
    }

    public void setRegiongroupTown(String regiongroupTown) {
        this.regiongroupTown = regiongroupTown;
    }

    @Override
    public String toString() {
        return "RegionGroup{" +
                "regiongroupId=" + regiongroupId +
                ", customerId=" + customerId +
                ", regiongroupProvince='" + regiongroupProvince + '\'' +
                ", regiongroupCity='" + regiongroupCity + '\'' +
                ", regiongroupTown='" + regiongroupTown + '\'' +
                '}';
    }
}
