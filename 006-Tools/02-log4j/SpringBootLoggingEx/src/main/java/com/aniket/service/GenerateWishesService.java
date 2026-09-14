package com.aniket.service;

import org.springframework.stereotype.Service;

@Service
public class GenerateWishesService implements IGreateService {

	@Override
	public String generateWishes() {
		
		 return "Good Morning! Have a Nice Day";
		
	}

}
