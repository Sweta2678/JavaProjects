package com.clone;

public class Company implements Cloneable {
	private String name;

	public Company(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
