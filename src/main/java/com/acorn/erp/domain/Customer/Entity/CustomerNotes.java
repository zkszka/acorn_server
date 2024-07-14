package com.acorn.erp.domain.Customer.Entity;

import java.sql.Date;

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
    name = "CUSTOMER_NOTES",
    uniqueConstraints = {@UniqueConstraint(columnNames = {"customer_id", "notes"})}
)
@Getter
@Setter
@NoArgsConstructor // Lombok을 사용하여 기본 생성자 생성
public class CustomerNotes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL에서는 IDENTITY 전략을 사용합니다.
    @Column(name = "notes_id")
    private int notesId;
    
    @Column(name = "customer_id", nullable = false)
    private int customerId;
    
    @Column(name = "notes_date")
    private Date notesDate;
    
    @Column(name = "notes")
    private String notes;

    // 생성자, Getter, Setter, toString 등은 Lombok의 어노테이션에 의해 자동 생성됩니다.

    @Override
    public String toString() {
        return "CustomerNotes [notesId=" + notesId + ", customerId=" + customerId + ", notesDate=" + notesDate
                + ", notes=" + notes + "]";
    }

    public CustomerNotes(int customerId, Date notesDate, String notes) {
        this.customerId = customerId;
        this.notesDate = notesDate;
        this.notes = notes;
    }
}
