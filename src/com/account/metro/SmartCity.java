package com.account.metro;

public class SmartCity {

	public static SmartCity city = null;

	public SmartCity() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}

	public static SmartCity getSmartCity() {

		if (city == null) {
			city = new SmartCity();
		}
		return city;
	}
}
