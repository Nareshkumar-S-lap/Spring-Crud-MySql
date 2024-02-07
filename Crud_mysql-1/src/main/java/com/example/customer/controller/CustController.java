package com.example.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.collection.Customer;
import com.example.customer.service.CustService;


@RestController
@RequestMapping(value = "/api/1.1")
public class CustController {
	@Autowired
	CustService as;
	
	
	

	@PostMapping(value = "/postAll1")
	public String postall(@RequestBody List<Customer> e) {
		return as.postAll(e);
		
	}

	@GetMapping(value = "getAll")
	public List<Customer> getAll() {
		return as.getAll();
	}

	@DeleteMapping(value = "/delete/{id}")
	public String deleteById(@PathVariable int id) {
		return as.deleteById(id);
	}

	@PutMapping(value = "/update")
	public String update(@RequestBody Customer e) {
		return as.update(e);
	}

	@GetMapping(value = "get2/{id}")
	public Customer getId(@PathVariable int id) {
		return as.getId(id);
	}



}
