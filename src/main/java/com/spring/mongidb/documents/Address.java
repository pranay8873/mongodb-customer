package com.spring.mongidb.documents;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String doorNo;
    private String street;
    private String city;
    private String state;
    private String country;
    private String pincode;
}
