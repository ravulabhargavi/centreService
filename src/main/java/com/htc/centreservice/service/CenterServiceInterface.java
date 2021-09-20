package com.htc.centreservice.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.centreservice.entity.CentreDetails;




public interface CenterServiceInterface  {
	public boolean addDetails(CentreDetails details);
	public List<CentreDetails> getAllDetails(String pinCode);
	
}
