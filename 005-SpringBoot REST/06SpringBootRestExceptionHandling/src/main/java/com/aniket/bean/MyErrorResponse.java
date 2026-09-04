package com.aniket.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyErrorResponse {

	private String Date;
	private String status;
	private int code;
	private String message;
}
