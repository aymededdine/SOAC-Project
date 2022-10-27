package com.ntic.gl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ntic.gl.entity.Student;
import com.ntic.gl.service.StudentServ;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentServ studentServ;
	
	@PostMapping("/insert")
	public boolean insert(@RequestBody Student std) {
		return studentServ.insert(std);
	}
	
	@PutMapping("/update")
	public boolean update(@RequestBody Student std) {
		return studentServ.update(std);
	}
	
	@GetMapping("/byId")
	public Student findById(@RequestParam long id) {
		return studentServ.findById(id);
	}
	
	@GetMapping("/byName")
	public List<Student> findByFullName(@RequestParam String name){
		return studentServ.findByFullName(name);
	}
	
	@GetMapping("/check")
	public boolean checkStudent(@RequestParam long id) {
		int year = 2010;
		Student current = studentServ.findById(id);
		if (current.getSignYear()==year) 
			return true;
		return false;
		
	}

}
