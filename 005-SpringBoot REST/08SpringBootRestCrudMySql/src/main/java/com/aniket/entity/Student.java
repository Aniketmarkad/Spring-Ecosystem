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
@Table(name="stdtab")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sid")
	private Integer stdId;
	
	@Column(name="sname")
	private String stdName;
	
	@Column(name="sgen")
	private String stdGen;
	
	@Column(name="scourse")
	private String stdCourse;
	   
	@Column(name="saddr")
	private String stdAddr;
	
	
}
