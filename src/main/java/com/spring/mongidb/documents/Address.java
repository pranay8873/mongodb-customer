package com.spring.mongidb.documents;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String doorNo;
    private String street;
    private String city;
    private String state;
    private String country;
    private String pincode;
}
