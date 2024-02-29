package com.example.relationship.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relationship.model.Customers;

@Repository
public interface CustomersRepo extends JpaRepository<Customers, Integer> {

}