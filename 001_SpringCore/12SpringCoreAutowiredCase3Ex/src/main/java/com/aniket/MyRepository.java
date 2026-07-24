package com.aniket;

public class MyRepository {
	
	private String Code;
	

	public MyRepository() {
		super();
	}
	
	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	@Override
	public String toString() {
		return "MyRepository [Code=" + Code + "]";
	}

}
