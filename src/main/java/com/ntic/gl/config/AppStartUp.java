package com.ntic.gl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ntic.gl.entity.Departement;
import com.ntic.gl.entity.Student;
import com.ntic.gl.service.DepartementServ;
import com.ntic.gl.service.StudentServ;

@Component
public class AppStartUp implements CommandLineRunner {

	@Autowired
	StudentServ studentServ;
	
	@Autowired
	DepartementServ departementServ;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Departement dep1 = new Departement();
		dep1.setName("GL");
		departementServ.insert(dep1);
		Departement dep2 = new Departement();
		dep2.setName("TI");
		departementServ.insert(dep2);
		Departement dep3 = new Departement();
		dep3.setName("MI");
		departementServ.insert(dep3);
		
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.setFullName("Riyad Mahrez");
		student1.setBithDate("10-3-1989");
		student1.setDep(dep1);
		student1.setSignYear(2010);
		
		student2.setFullName("Ouness Gawaoui");
		student2.setBithDate("10-4-1980");
		student2.setDep(dep2);
		student2.setSignYear(2010);
		
		student3.setFullName("Faouzi Shawshi");
		student3.setBithDate("10-3-1989");
		student3.setDep(dep3);
		student3.setSignYear(2009);
		
		studentServ.insert(student1);
		studentServ.insert(student2);
		studentServ.insert(student3);
		
	}

}
