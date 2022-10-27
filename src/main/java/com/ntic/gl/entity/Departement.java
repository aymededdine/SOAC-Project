package com.ntic.gl.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departements_fac")
public class Departement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="dep_id")
	private long id;
	
	@Column(name="dep_name")
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//@OneToMany(mappedBy = "department")
	//private List<Student> student;
	
	

}
