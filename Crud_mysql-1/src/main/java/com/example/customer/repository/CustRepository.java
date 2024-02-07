package com.example.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customer.collection.Customer;
public interface CustRepository extends JpaRepository<Customer, Integer> {


}