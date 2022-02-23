package com.clone.jpaclone.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name = "tb_subject")
public class Subject {
	
	@Id
	@Column(name="subject_code")
	private int subjectCode;
	
	@Column(name="subject_name")
	private String subjectName;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)//(mappedBy="subject")
	@JoinColumn(name="subject_code")
	private List<Domain> domain;

}
