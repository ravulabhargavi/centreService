package com.htc.centreservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.htc.centreservice.entity.CentreDetails;
import com.htc.centreservice.service.CenterServiceInterface;


@RestController
@RequestMapping("/api")
public class CentreServiceController {
	@Autowired
	private CenterServiceInterface centreServiceInterface;
	@PostMapping("/centreDetails") 
	public boolean addDetails(@RequestBody CentreDetails centreDetails) {
		return centreServiceInterface.addDetails(centreDetails);
	}
	@GetMapping("/centreDetails")
	public List<CentreDetails> displayAllDetails(@PathVariable String pinCode){
		
		return centreServiceInterface.getAllDetails(pinCode);
	}
		 
	}


