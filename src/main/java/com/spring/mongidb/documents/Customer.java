package com.spring.mongidb.documents;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
@Data
@Builder
public class Customer {
    @Id
    private String id;
    private String name;
    private byte age;
    private String email;
    private String phone;
    private Address address;
    private String password;
}

