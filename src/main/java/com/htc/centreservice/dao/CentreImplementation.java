package com.htc.centreservice.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;

import com.htc.centreservice.entity.CentreDetails;



public class CentreImplementation implements CentreInterface {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean addDetails(CentreDetails details) {
		boolean addDetails=false;
		 EntityManager entityManager =entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction =entityManager.getTransaction();
		 try {
		 		entityTransaction.begin();
		 		entityManager.persist(details);
		 		entityTransaction.commit();
		 		addDetails=true;
		 	}catch (Exception e) {
		 		entityTransaction.rollback();
		 		e.printStackTrace();
			}finally {
				entityManager.close();
			}
		return addDetails;
	}
		

	@Override
	public List<CentreDetails> getAllDetails(String pinCode) {
		// TODO Auto-generated method stub
		List<CentreDetails> centrelist=new ArrayList<>();
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		CentreDetails details=null;
		 try{
			 details=(CentreDetails) entityManager.find(CentreDetails.class, pinCode);
			 }catch (Exception e) {
		          e.printStackTrace();
		}finally {
			entityManager.close();
		}
		return centrelist;
	}
	}
	
	

	


