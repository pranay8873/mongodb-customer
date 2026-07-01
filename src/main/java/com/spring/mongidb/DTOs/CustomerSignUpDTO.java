package com.spring.mongidb.DTOs;

import com.spring.mongidb.documents.Address;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerSignUpDTO {
    private String name;
    private byte age;
    private String email;
    private String phone;
    private Address address;
    private String password;
}
