package com.start;

public class BestFriend extends Friend{
	
	public BestFriend(String name,String homeTown) {
		super(name,homeTown);
	}
	@Override
	public void getInfo() {
		System.out.println(name+" is my friend and is from "+homeTown+".");
	}
	
	public void getInfo(String favSong) {
		System.out.println(name+" is my friend and is from "+homeTown+". His favorite song is "+favSong+".");
	}
}
