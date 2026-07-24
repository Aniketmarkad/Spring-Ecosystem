package com.aniket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ModelData {

	@Value("TEST")
	private String model;

	public ModelData() {
		super();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "ModelData [model=" + model + "]";
	}
	
	
}
