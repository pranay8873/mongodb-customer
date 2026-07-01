package com.spring.mongidb.service;

import com.spring.mongidb.DTOs.CustomerResponseDTO;
import com.spring.mongidb.DTOs.CustomerSignUpDTO;
import com.spring.mongidb.documents.Customer;
import com.spring.mongidb.repository.Customer_Repo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService implements CustomerServ {
    private final Customer_Repo customerRepository;
    private final ModelMapper modelMapper;
    @Override
    public CustomerResponseDTO saveCustomer(CustomerSignUpDTO customerSignUpDTO) {
        if(customerRepository.findByEmail(customerSignUpDTO.getEmail()).isPresent()){
            throw new RuntimeException("Customer with email "+customerSignUpDTO.getEmail()+" already exists");
        }
        else {
            return modelMapper.map(customerRepository.save(modelMapper.map(customerSignUpDTO, Customer.class)), CustomerResponseDTO.class);
        }


    }

    @Override
    public CustomerResponseDTO getCustomerById(String id) {
        if(customerRepository.findById(id).isPresent()){
            return modelMapper.map(customerRepository.findById(id).get(), CustomerResponseDTO.class);
        }
        else {
            throw new RuntimeException("Customer with id "+id+" not found");
        }
    }

    @Override
    public CustomerResponseDTO customerlogin(String email, String password) {
        if(customerRepository.findByEmail(email).isPresent()){
            Customer customer = customerRepository.findByEmail(email).get();
            if(customer.getPassword().equals(password)){
                return modelMapper.map(customer, CustomerResponseDTO.class);
            }
            else {
                throw new RuntimeException("Invalid password");
            }
        }
        else {
            throw new RuntimeException("Customer with email "+email+" not found");
        }
    }

    @Override
    public CustomerResponseDTO getCustomerByEmail(String email) {
        if(customerRepository.findByEmail(email).isPresent()){
            return modelMapper.map(customerRepository.findByEmail(email).get(), CustomerResponseDTO.class);
        }
        else {
            throw new RuntimeException("Customer with email "+email+" not found");
        }
    }
}

