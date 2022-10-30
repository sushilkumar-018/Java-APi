package com.springapi.springAPI.entities;

public class customers {
	
	private long customer_id;
	private String Customer_Name;
	private String Email;
	private long Mnumber;
	private String city;
	public customers(long customer_id, String customer_Name, String email, long mnumber, String city) {
		super();
		this.customer_id = customer_id;
		this.Customer_Name = customer_Name;
		this.Email = email;
		this.Mnumber = mnumber;
		this.city = city;
	}
	public customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getMnumber() {
		return Mnumber;
	}
	public void setMnumber(long mnumber) {
		Mnumber = mnumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "courses [customer_id=" + customer_id + ", Customer_Name=" + Customer_Name + ", Email=" + Email
				+ ", Mnumber=" + Mnumber + ", city=" + city + "]";
	}
	
	
	
	
}

