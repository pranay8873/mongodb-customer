package com.spring.mongidb.repository;

import com.spring.mongidb.documents.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Customer_Repo extends MongoRepository<Customer, String> {
    @Override
    Optional<Customer> findById(String s);
    Optional<Customer> findByEmail(String email);

}
