package com.ntic.gl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntic.gl.entity.Departement;
import com.ntic.gl.entity.Student;
import com.ntic.gl.repository.DepartementRepo;

@Service
public class DepartementServ {
	
	@Autowired
	private DepartementRepo departementRepo;
	
	public boolean insert(Departement std) {
		return departementRepo.save(std) != null;
	}
	
	public boolean update(Departement std) {
		return departementRepo.save(std) != null;
	}

	public List<Departement> findAll() {
		// TODO Auto-generated method stub
		return (List<Departement>) departementRepo.findAll();
	}


	
	

}
