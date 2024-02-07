package com.example.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.customer.collection.Customer;
import com.example.customer.repository.CustRepository;


@Repository
public class CustDao {
	@Autowired
	CustRepository ar;


	public String postAll(List<Customer> year) {
		ar.saveAll(year);

		return "Data Saved";
	}

	public String deleteById(int id) {
		ar.deleteById(id);

		return "Data Deleted";
	}

	public List<Customer> getAll() {
		return ar.findAll();
	}

	public String update(Customer e) {
		ar.save(e);
		return "Data Updated";

	}

	public Customer getId(int id) {
		return ar.findById(id).get();
	}

	
	
}
