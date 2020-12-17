package com.egen.shipping.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "shipping")
@Getter
@Setter
@JsonSerialize
public class Shipping {

    @Column(name = "shipping_id")
    private long id;
    @Column(name = "order_id")
    private long orderId;
    @Column(name = "order_shipping_addressline1")
    private String addressLine1;
    @Column(name = "order_shipping_addressline2")
    private String addressLine2;
    @Column(name = "order_shipping_city")
    private String city;
    @Column(name = "order_shipping_state")
    private String state;
    @Column(name = "order_shipping_zip")
    private int zip;
    @Column(name = "order_shipping_country")
    private String country;

    public void setId(long id) {
        this.id = id;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}