package com.ntic.gl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ntic.gl.entity.Departement;

@Repository
public interface DepartementRepo extends CrudRepository<Departement, Long> {

}
