package com.start;

public class User {
	public static void main(String[] args) {
		Acquaintance acq = new Acquaintance("David");
		Friend fr = new Friend("Mike","New York");
		BestFriend bf1 = new BestFriend("Alex","Manhattan");
		BestFriend bf2 = new BestFriend("Rob","Michigan");
		acq.getInfo();
		fr.getInfo();
		bf1.getInfo();
		bf2.getInfo("Applause");
	}
}
