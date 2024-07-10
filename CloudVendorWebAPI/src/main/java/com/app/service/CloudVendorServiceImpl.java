package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.CloudVendor;
import com.app.repository.CloudVendorRepo;

@Service
public class CloudVendorServiceImpl implements CloudVendorService 
{
	
	CloudVendorRepo repo;
	
	public CloudVendorServiceImpl(CloudVendorRepo cloud)
	{
		this.repo=cloud;
	}
	

	@Override
	public String createCloudVendor(CloudVendor cv)
	{
		repo.save(cv);
		return "Data added Successfully!";
	}

	@Override
	public String updateCloudVendor(CloudVendor cv)
	{
		repo.save(cv);
		return "updated Successfully";
	}

	@Override
	public String deleteCloudVendor(int vendorId) 
	{
		repo.deleteById(vendorId);
		return "deleted Successfully";
	}

	@Override
	public CloudVendor getCloudVendor(int vendorId)
	{
		
		return repo.findById(vendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() 
	{
		
		return repo.findAll();
	}

}
