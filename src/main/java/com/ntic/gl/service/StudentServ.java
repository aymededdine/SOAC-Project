package com.ntic.gl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntic.gl.entity.Student;
import com.ntic.gl.repository.StudentRepo;

@Service
public class StudentServ {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public boolean insert(Student std) {
		return studentRepo.save(std) != null;
	}
	
	public boolean update(Student std) {
		return studentRepo.save(std) != null;
	}
	
	public Student findById(long id) {
		return studentRepo.findById(id).get();
	}
	
	public List<Student> findByFullName(String name){
		return studentRepo.findByFullName(name);
	}
	
	public boolean checkStudent(long id) {
		Student current = studentRepo.findById(id).get();
		return current !=null;
	}

	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepo.findAll();
	}

}
