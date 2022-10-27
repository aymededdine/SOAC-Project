package com.ntic.gl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntic.gl.entity.Departement;
import com.ntic.gl.repository.DepartementRepo;

@Service
public class DepartementServ {
	
	@Autowired
	private DepartementRepo DepartementRepo;
	
	public boolean insert(Departement std) {
		return DepartementRepo.save(std) != null;
	}
	
	public boolean update(Departement std) {
		return DepartementRepo.save(std) != null;
	}
	
	

}
