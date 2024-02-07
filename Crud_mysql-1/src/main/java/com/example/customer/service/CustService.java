package com.example.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.collection.Customer;
import com.example.customer.dao.CustDao;
import com.example.customer.repository.CustRepository;

@Service
public class CustService {
	@Autowired
	CustDao ad;

	 public String postAll(List<Customer> e) {
		 ad.postAll(e);
		 return "Saved data";
	}

	public List<Customer> getAll() {
		return ad.getAll();
	}

	public String deleteById(int id) {
		return ad.deleteById(id);
	}

//	@PutMapping(value = "/update")
	public String update(Customer e) {
		return ad.update(e);
	}

	public Customer getId(int id) {
		return ad.getId(id);
	}

	
}
