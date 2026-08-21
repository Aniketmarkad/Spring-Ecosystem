package com.aniket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="stud_tab")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sid")
	private Integer Sid;
	
	@Column(name="sName")
	private String sName;
	
	@Column(name="sDept")
	private String sDept;
	
	@Column(name="sFee")
	private Double sFee;

}
