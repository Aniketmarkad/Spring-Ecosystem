package com.aniket;

import org.springframework.stereotype.Component;

@Component("pobA")
public class AdvProcessImpl implements IProcess {

	@Override
	public void getProcesCode() {
		System.out.println("P2");
	}

}
