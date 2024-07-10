package com.app.service;

import java.util.List;

import com.app.model.CloudVendor;

public interface CloudVendorService 
{
	
	public String createCloudVendor(CloudVendor cv);
	
	public String updateCloudVendor(CloudVendor cv);
	
	public String deleteCloudVendor(int vendorId);
	
	public CloudVendor getCloudVendor(int vendorId);
	
	public List<CloudVendor> getAllCloudVendor();
	
}
