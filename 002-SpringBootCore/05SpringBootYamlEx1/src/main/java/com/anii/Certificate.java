package com.anii;

public class Certificate {
	
	private String provider;
	private String expExist;
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getExpExist() {
		return expExist;
	}
	public void setExpExist(String expExist) {
		this.expExist = expExist;
	}
	@Override
	public String toString() {
		return "Certificate [provider=" + provider + ", expExist=" + expExist + "]";
	}

	
}
