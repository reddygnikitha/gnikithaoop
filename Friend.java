package com.start;

public class Friend extends Acquaintance{
	String homeTown;
	
	public Friend(String name,String town) {
		super(name);
		homeTown = town;
		
	}
	
	@Override
	public void getInfo() {
		System.out.println(name+" is my friend and is from "+homeTown+".");
	}
}
