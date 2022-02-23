package com.clone.jpaclone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clone.jpaclone.model.Level;

@Repository
public interface LevelRepository extends JpaRepository<Level, Long>{
	
	List<Level> findByLevelCode(int levelCode);
	
	
	//User user findByUserId(int UserId);
	//List<Child> children findByUserId(int UserId);
}
