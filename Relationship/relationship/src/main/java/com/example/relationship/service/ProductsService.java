package com.example.relationship.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.relationship.model.Products;
import com.example.relationship.repository.ProductsRepo;

public class ProductsService {
    @Autowired
    private ProductsRepo cr;

    public Products insert(Products c) {
        return cr.save(c);
    }
}