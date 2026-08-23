package com.aniket.entity;

import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private Integer userId;
	private String userName;
	private String userRole;
	
	private Set<String> permissions;
	
	private Map<String,String> models;
	
}
