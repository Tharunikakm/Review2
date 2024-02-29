package com.example.relationship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.relationship.model.Customers;
// import com.example.onetomany.model.OrderRequest;
// import com.example.onetomany.repository.ProductsRepo;
import com.example.relationship.service.CustomersService;
// import com.example.onetomany.service.ProductsService;

@RestController
public class CustomersController {
    @Autowired
    private CustomersService repo;

    @PostMapping("/customers")
    public ResponseEntity<Customers> insert(@RequestBody Customers cus) {
        Customers cp = repo.insert(cus);
        return new ResponseEntity<>(cp, HttpStatus.CREATED);
    }
}