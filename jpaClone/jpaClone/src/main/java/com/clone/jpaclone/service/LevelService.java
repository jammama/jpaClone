package com.clone.jpaclone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clone.jpaclone.model.Level;
import com.clone.jpaclone.repository.LevelRepository;

@Service
public class LevelService {

	@Autowired
	LevelRepository levelRepository;
	
	public List<Level> findByLevelCode(int levelCode) {
		List<Level> levelList = levelRepository.findByLevelCode(levelCode);
		return levelList;
	}
	
	
}
