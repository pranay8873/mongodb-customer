package com.spring.mongidb.controler;

import com.spring.mongidb.DTOs.CustomerLogInDTO;
import com.spring.mongidb.DTOs.CustomerResponseDTO;
import com.spring.mongidb.DTOs.CustomerSignUpDTO;
import com.spring.mongidb.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerControler {
    private final CustomerService customerService;

    @PostMapping("/add")
    public ResponseEntity<CustomerResponseDTO> addCustomer(@RequestBody CustomerSignUpDTO customerSignUpDto) {
        return ResponseEntity.ok(customerService.saveCustomer(customerSignUpDto));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<CustomerResponseDTO> getCustomerById(@PathVariable String id) {
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }

    @GetMapping("/getByEmail")
    public ResponseEntity<CustomerResponseDTO> getCustomerByEmail(@RequestParam String email) {
        return ResponseEntity.ok(customerService.getCustomerByEmail(email));
    }

    @GetMapping("/login")
    public ResponseEntity<CustomerResponseDTO> loginCustomer(@RequestBody CustomerLogInDTO customerLogInDTO) {
        String email = customerLogInDTO.getEmail();
        String password = customerLogInDTO.getPassword();
        return ResponseEntity.ok(customerService.customerlogin(email, password));
    }


}

