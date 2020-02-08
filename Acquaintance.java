package com.start;

public class Acquaintance implements Relation{
	String name;
	
	public Acquaintance(String name) {
		this.name = name;
	}

	@Override
	public void getInfo() {
		System.out.println(name+" is just my acquaintance.");			
	}
}
