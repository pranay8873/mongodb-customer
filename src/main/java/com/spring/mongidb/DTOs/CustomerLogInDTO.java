package com.spring.mongidb.DTOs;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerLogInDTO {
    private String email;
    private String password;
}
