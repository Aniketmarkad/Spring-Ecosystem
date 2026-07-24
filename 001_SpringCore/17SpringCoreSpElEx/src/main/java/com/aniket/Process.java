package com.aniket;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Process {
	
	@Value(" #{ modelData.model.replace('T','A') }")
	private String code;
	
	@Value("#{modelData.model.lines()}")
	private Stream<String> stream;
	
	@Value(" #{ modelData.model.getBytes() }")
	private  byte[]arr;
	
	@Value(" #{ modelData.model.toCharArray() }")
	private char[] data;
	
	@Value(" #{ 5 % 2 > 0 and 2 + 3 le 5  }")
	private boolean isPresent;

	@Override
	public String toString() {
		return "Process [code=" + code + ", stream=" + stream + ", arr=" + arr + ", data=" + data + ", isPresent="
				+ isPresent + "]";
	}

}
