package com.aniket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class TokenService {

	@Autowired // Field Injection
	private Token token;
	
	public Token getToken() {
		token = getMyToken();
		return token;
	}
	
	@Lookup
	public Token getMyToken() {
		//....
		return null;
	}

	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}
	
}
