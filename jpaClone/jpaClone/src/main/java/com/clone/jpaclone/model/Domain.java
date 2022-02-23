package com.clone.jpaclone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_domain")
public class Domain {
	
	@Id
	@Column(name="domain_code")
	private int domainCode;
	
	@Column(name="domain_name")
	private String domainName;

	@Column(name="subject_code")
	private int subjectCode;
	
//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
//	@JoinColumn(name="subject_code")
//	private Subject subject;
	
}
