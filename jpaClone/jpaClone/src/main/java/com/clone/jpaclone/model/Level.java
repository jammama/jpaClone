package com.clone.jpaclone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_level")
public class Level {
	
	@Id
	@Column(name="level_code")
	private int levelCode;
	
	@Column(name="level_name")
	private String levelName;
	
}
