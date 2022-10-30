package com.springapi.springAPI.services;
import java.util.List;

import com.springapi.springAPI.entities.customers;

public interface customerservice {

	public List<customers>getcustomers();
	
	public customers getcustomer(long customerID);
	
	public customers addcustomer(customers customer);
}
 