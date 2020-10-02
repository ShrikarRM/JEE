package com.account.metro;

public class OnlineTester {

	public static void main(String[] args) {

		Education online=Education.getObject();
		System.out.println(online);
		
		Education offline = Education.getObject();
		System.out.println(offline);
	}

}
