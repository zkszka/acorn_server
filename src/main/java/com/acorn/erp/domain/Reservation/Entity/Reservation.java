package com.acorn.erp.domain.Reservation.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "reservation_date", length = 255, nullable = false)
    private String reservationDate;

    @Column(name = "requests", length = 255)
    private String requests;

    @Column(name = "payment", length = 255)
    private String payment;

    @Column(name = "phone", length = 255, nullable = false)
    private String phone;

    @Column(name = "gender", length = 255)
    private String gender;

    @Column(name = "rs_count")
    private int rsCount;

    // 생성자, Getter, Setter, toString 등은 필요에 따라 추가할 수 있음

    // 기본 생성자
    public Reservation() {
    }

    // 생성자
    public Reservation(Long id, String name, String reservationDate, String requests, String payment, String phone,
                       String gender, int rsCount) {
        this.id = id;
        this.name = name;
        this.reservationDate = reservationDate;
        this.requests = requests;
        this.payment = payment;
        this.phone = phone;
        this.gender = gender;
        this.rsCount = rsCount;
    }

    // Getter 및 Setter (일부 생략 가능)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getRequests() {
        return requests;
    }

    public void setRequests(String requests) {
        this.requests = requests;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getRsCount() {
        return rsCount;
    }

    public void setRsCount(int rsCount) {
        this.rsCount = rsCount;
    }

    // toString 등 다른 메서드들도 필요에 따라 추가할 수 있음
}
