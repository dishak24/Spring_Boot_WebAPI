package com.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.CloudVendor;
import com.app.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController
{

	//CloudVendor vendor;
	CloudVendorService service;
	
	public CloudVendorController(CloudVendorService service)
	{
		this.service=service;
	}
	
//getting by id only
	@GetMapping("{vendorId}")
	public CloudVendor getCloudDetails(@PathVariable("vendorId") int vendorId)
	{
		
		return service.getCloudVendor(vendorId);
	}
	
//getting all 
	@GetMapping
	public List<CloudVendor> getAllCloudDetails()
	{
		
		return service.getAllCloudVendor();
	}
	
//adding
	@PostMapping
	public String insertCloudDetails(@RequestBody CloudVendor cv)
	{	
		service.createCloudVendor(cv);
		return "Added Successfully!";
	}
	
//updating
	@PutMapping
	public String updateCloudDetails(@RequestBody CloudVendor cv)
	{
		service.updateCloudVendor(cv);
		return "Updated Successfully";
		
	}
	
//deleting	
	@DeleteMapping("{vendorId}")
	public String deleteCloudDetails(@PathVariable("vendorId") int vendorId)
	{
		service.deleteCloudVendor(vendorId);
		return "Deleted Successfully";
		
	}
}
