package com.spring.mongidb.Exceptions;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String message) {

        super(message);
    }
}
