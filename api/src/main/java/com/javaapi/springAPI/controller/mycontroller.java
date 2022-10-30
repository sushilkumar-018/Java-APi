package com.springapi.springAPI.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.springapi.springAPI.services.*;
import com.springapi.springAPI.entities.customers;

@RestController
public class mycontroller {
	
	@Autowired
	private customerservice customerservice;

	@GetMapping("/home")
	public String home()
	{
		return "This is Home Page"; 
	}
	
	//get customers
	@GetMapping("/customers")
	public List<customers>getcustomers()
	{
		return this.customerservice.getcustomers();
	}
	
	@GetMapping("/customers/{customerID}")
	public customers getCustomer(@PathVariable String customerID)
	{
		return this.customerservice.getcustomer(Long.parseLong(customerID));
		
	}
	
	@PostMapping("/addcustomer")
	public customers addcustomer(@RequestBody customers customer)
	{
		return this.customerservice.addcustomer(customer);
	}
}
