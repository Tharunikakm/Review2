package com.example.relationship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relationship.model.Customers;
import com.example.relationship.repository.CustomersRepo;

@Service
public class CustomersService {
    @Autowired
    private CustomersRepo cr;

    public Customers insert(Customers c) {
        return cr.save(c);
    }
}