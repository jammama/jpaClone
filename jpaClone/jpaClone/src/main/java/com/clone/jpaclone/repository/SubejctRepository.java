package com.clone.jpaclone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clone.jpaclone.model.Subject;


@Repository
public interface SubejctRepository extends JpaRepository<Subject, Long>{
	
	List<Subject> findBySubjectCode(int subjectCode);
	
	List<Subject> findAll();
}
