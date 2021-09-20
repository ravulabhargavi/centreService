package com.htc.centreservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.htc.centreservice.dao.CentreInterface;
import com.htc.centreservice.entity.CentreDetails;

public class CentreServiceImplementation implements CenterServiceInterface{

	
	@Autowired
	private CentreInterface centreservice;
	@Override
	public boolean addDetails(CentreDetails details) {
		// TODO Auto-generated method stub
		return centreservice.addDetails(details);
	}

	@Override
	public List<CentreDetails> getAllDetails(String pinCode) {
		// TODO Auto-generated method stub
		return centreservice.getAllDetails(pinCode);
	}

}
