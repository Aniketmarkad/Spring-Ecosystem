package com.anii;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("my.app")
public class MyDbConnection {

	private String driver;
	private String url;
	private String user;
	private String pwd;
	
	
}
