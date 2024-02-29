package com.example.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relationship.model.Products;

@Repository
public interface ProductsRepo extends JpaRepository<Products, Integer> {

}