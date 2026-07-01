package com.spring.mongidb.service;

import com.spring.mongidb.DTOs.CustomerResponseDTO;
import com.spring.mongidb.DTOs.CustomerSignUpDTO;
import com.spring.mongidb.Exceptions.CustomerExistException;
import com.spring.mongidb.Exceptions.CustomerNotFoundException;

public interface CustomerServ {
 CustomerResponseDTO saveCustomer(CustomerSignUpDTO customerSignUpDTO) throws CustomerExistException;
 CustomerResponseDTO getCustomerById(String id) throws CustomerNotFoundException;
 CustomerResponseDTO customerlogin(String email,String password) throws CustomerNotFoundException;
 CustomerResponseDTO getCustomerByEmail(String email) throws CustomerNotFoundException;
}
