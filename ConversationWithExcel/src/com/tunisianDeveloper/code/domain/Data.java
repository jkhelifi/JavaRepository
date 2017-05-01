package com.tunisianDeveloper.code.domain;

public class Data {
	
	
private Object [][] flux;
	
	public Data() {
		super();
		flux=new Object[6][6];
	}

	public Object[][] getFlux() {
		return flux;
	}

	public void setFlux(Object[][] flux) {
		this.flux = flux;
	}

}
