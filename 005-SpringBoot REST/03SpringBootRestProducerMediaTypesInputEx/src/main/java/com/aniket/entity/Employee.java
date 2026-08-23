package com.aniket.entity;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Employee {

	private Integer empId;
	private String empName;
	private Double empSal;
	
	private Address addr;
	
	private List<String>projects;
	
	private Map<String,Integer> codes;
}
