package com.anii;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import io.micrometer.common.lang.NonNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Component
@ConfigurationProperties("my.app")
public class AdvProcess {
	
	@NonNull
	private int id;
	private String type;
	private String role;

}
