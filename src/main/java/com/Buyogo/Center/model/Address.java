package com.Buyogo.Center.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String detailedAddress;
    private String city;
    private String state;
    private String pincode;

}
