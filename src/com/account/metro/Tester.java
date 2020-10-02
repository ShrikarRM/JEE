package com.account.metro;

public class Tester {

	public static void main(String[] args) {
		
		Metro metro= new Metro();
		metro.name="namma metro";
		metro.noOfCoaches=6;
		
		metro.transport();
		System.out.println(metro.toString());
	}

}
