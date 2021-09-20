package com.htc.centreservice.dao;

import java.util.List;

import com.htc.centreservice.entity.CentreDetails;

public interface CentreInterface {
	public boolean addDetails(CentreDetails details);
	public List<CentreDetails> getAllDetails(String pinCode);

}
