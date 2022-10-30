package com.springapi.springAPI.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springapi.springAPI.entities.customers;

@Service
public class customerserviceimpl implements customerservice {
	
	
	List<customers>list;
	
	public customerserviceimpl() {
		
		//temporary database
		list = new ArrayList<>();
		list.add(new customers(11,"Raj","kbnagaraj18@gmail.com",944334432,"Bangalore"));
		list.add(new customers(12,"KNRaj","raj8@gmail.com",934334332,"BLY"));
	}



	@Override
	public List<customers> getcustomers() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public customers getcustomer(long customerID) {
		// TODO Auto-generated method stub
		customers c =null;
		
		for(customers cus:list)
		{
			if(cus.getCustomer_id()==customerID)
			{
				c = cus;
				break;
			}
		}
		return c;
	}



	@Override
	public customers addcustomer(customers customer) {
		// TODO Auto-generated method stub
		list.add(customer);
		return customer;
	}

}
