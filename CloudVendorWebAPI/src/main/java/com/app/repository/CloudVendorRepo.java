package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.CloudVendor;

public interface CloudVendorRepo extends JpaRepository<CloudVendor, Integer> 
{

}
