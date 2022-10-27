package com.ntic.gl.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="students_fac")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="student_id")
	private long id;
	
	@Column(name="student_name")
	private String fullName;
	
	@Column(name="student_birth_date")
	private String bithDate;
	
	@Column(name="student_sign_year")
	private int signYear;
	
	
	public int getSignYear() {
		return signYear;
	}

	public void setSignYear(int signYear) {
		this.signYear = signYear;
	}

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="dep_id")
	private Departement dep;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBithDate() {
		return bithDate;
	}

	public void setBithDate(String bithDate) {
		this.bithDate = bithDate;
	}


	public Departement getDep() {
		return dep;
	}

	public void setDep(Departement dep) {
		this.dep = dep;
	}
	
	
	
}
