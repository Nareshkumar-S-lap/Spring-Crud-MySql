package com.example.customer.collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="customerdetails")
public class Customer {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;
	@Column(name = "customer_name")
	private String name;
	@Column(name="customer_email")
	private String email;
	@Column(name="customer_number")
	private long number;
	@Column(name="customer_purcharseitem")
	private String item;
	public Customer(int custId, String name, String email, long number, String item) {
		super();
		this.custId = custId;
		this.name = name;
		this.email = email;
		this.number = number;
		this.item = item;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", email=" + email + ", number=" + number + ", item="
				+ item + "]";
	}
	
}
	
	   
	
	
	
