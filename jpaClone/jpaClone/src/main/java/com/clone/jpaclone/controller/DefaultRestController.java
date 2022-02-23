package com.clone.jpaclone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clone.jpaclone.model.Level;
import com.clone.jpaclone.model.Subject;
import com.clone.jpaclone.service.LevelService;
import com.clone.jpaclone.service.SubjectService;

@RestController
public class DefaultRestController {
 
	@Autowired
	LevelService levelService;
	
	@Autowired
	SubjectService subjectService;
	
	@GetMapping(value = "/test")
	public String test() {
		
		return "hello devil";
	}
	
	@GetMapping(value = "/findByLevelCode")
	public List<Level> findByLevelCode(@RequestParam int levelCode) {
		
		List<Level> levelList = levelService.findByLevelCode(levelCode);
		
		return levelList;
	}
	
	@GetMapping(value = "/findBySubjectCode")
	public List<Subject> findBySubjectCode(@RequestParam int subjectCode) {
		
		List<Subject> subjectList = subjectService.findBySubjectCode(subjectCode);
		
		return subjectList;
	}
	
	@GetMapping(value = "/findAllSubject")
	public List<Subject> findAllSubject() {
		
		List<Subject> subjectList = subjectService.findAllSubject();
		
		return subjectList;
	}
}
