package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cloud_vendor")

public class CloudVendor 
{
	@Id
	private int vendorId;
	private String vendorName;
	private String Address;
	private String phoneNumber;
	
	
	public CloudVendor()
	{
		
	}
	
	public CloudVendor(int vendorId, String vendorName, String address, String phoneNumber) 
	{
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		Address = address;
		this.phoneNumber = phoneNumber;
	}

	
	public int getVendorId()
	{
		return vendorId;
	}

	public void setVendorId(int vendorId)
	{
		this.vendorId = vendorId;
	}

	public String getVendorName() 
	{
		return vendorName;
	}

	public void setVendorName(String vendorName)
	{
		this.vendorName = vendorName;
	}

	public String getAddress() 
	{
		return Address;
	}

	public void setAddress(String address) 
	{
		Address = address;
	}

	public String getPhoneNumber() 
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	

}
