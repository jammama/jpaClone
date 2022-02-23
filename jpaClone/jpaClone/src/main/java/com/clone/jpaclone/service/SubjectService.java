package com.clone.jpaclone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clone.jpaclone.model.Subject;
import com.clone.jpaclone.repository.SubejctRepository;

@Service
public class SubjectService {

	@Autowired
	SubejctRepository subjectRepository;
	
	public List<Subject> findBySubjectCode(int subjectCode) {
		List<Subject> subjectList = subjectRepository.findBySubjectCode(subjectCode);
		return subjectList;
	}
	
	public List<Subject> findAllSubject() {
		List<Subject> subjectList = subjectRepository.findAll();
		return subjectList;
	}
}
