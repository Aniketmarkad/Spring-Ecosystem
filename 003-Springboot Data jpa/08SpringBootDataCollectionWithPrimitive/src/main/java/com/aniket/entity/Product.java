package com.aniket.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="prodtab")
public class Product {
	
	@Id
	@Column(name="pid")
	private Integer prodId;
	@Column(name="pcode")
	private String prodCode;
	
	@ElementCollection
	private List<String> colors;
	
	@ElementCollection
	private Set<String> models;
	
	@ElementCollection
	private Map<String,String> details;

}
