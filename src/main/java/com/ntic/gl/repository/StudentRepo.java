package com.ntic.gl.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ntic.gl.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {

	List<Student> findByFullName(String name);

}
