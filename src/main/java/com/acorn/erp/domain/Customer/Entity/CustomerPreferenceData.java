package com.acorn.erp.domain.Customer.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
    name = "CUSTOMER_PREFERENCE_DATA",
    uniqueConstraints = {@UniqueConstraint(columnNames = {"preference_data_id"})}
)
@Getter
@Setter
@NoArgsConstructor // Lombok을 사용하여 기본 생성자 생성
public class CustomerPreferenceData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL에서는 IDENTITY 전략을 사용합니다.
    @Column(name = "preference_data_id")
    private int preferenceDataId;
    
    @Column(name = "item_name")
    private String itemName;
    
    @Column(name = "total_amount_for_product")
    private int totalAmountForProduct;
    
    @Column(name = "total_count_for_product")
    private int totalCountForProduct;
    
    @Column(name = "rating")
    private double rating;
    
    @Column(name = "gender_preference")
    private String genderPreference;
    
    @Column(name = "age_preference")
    private String agePreference;
    
    @Column(name = "region_preference_province")
    private String regionPreferenceProvince;
    
    @Column(name = "region_preference_city")
    private String regionPreferenceCity;
    
    @Column(name = "region_preference_town")
    private String regionPreferenceTown;

    // 생성자, Getter, Setter, toString 등은 Lombok의 어노테이션에 의해 자동 생성됩니다.

    @Override
    public String toString() {
        return "CustomerPreferenceData [preferenceDataId=" + preferenceDataId + ", itemName=" + itemName
                + ", totalAmountForProduct=" + totalAmountForProduct + ", totalCountForProduct=" + totalCountForProduct
                + ", rating=" + rating + ", genderPreference=" + genderPreference + ", agePreference=" + agePreference
                + ", regionPreferenceProvince=" + regionPreferenceProvince + ", regionPreferenceCity="
                + regionPreferenceCity + ", regionPreferenceTown=" + regionPreferenceTown + "]";
    }

    public CustomerPreferenceData(String itemName, int totalAmountForProduct, int totalCountForProduct,
            double rating, String genderPreference, String agePreference, String regionPreferenceProvince,
            String regionPreferenceCity, String regionPreferenceTown) {
        this.itemName = itemName;
        this.totalAmountForProduct = totalAmountForProduct;
        this.totalCountForProduct = totalCountForProduct;
        this.rating = rating;
        this.genderPreference = genderPreference;
        this.agePreference = agePreference;
        this.regionPreferenceProvince = regionPreferenceProvince;
        this.regionPreferenceCity = regionPreferenceCity;
        this.regionPreferenceTown = regionPreferenceTown;
    }
}
