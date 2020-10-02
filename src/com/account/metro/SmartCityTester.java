package com.account.metro;

public class SmartCityTester {

	public static void main(String[] args) {

		SmartCity smartcity = SmartCity.getSmartCity();
		System.out.println(smartcity);

		SmartCity smartcity1 = new SmartCity();
		System.out.println(smartcity1);
		
		SmartCity smartcity2=SmartCity.getSmartCity();
		System.out.println(smartcity2);
		
		SmartCity smartcity3=SmartCity.getSmartCity();
		System.out.println(smartcity2);
	}

}
