package com.account.metro;

public class Metro {
	public String name;
	public int noOfCoaches;

	public void transport() {
		System.out.println("Travelling now");
	}

	@Override
	public String toString() {
		return "Metro [name=" + name + ", noOfCoaches=" + noOfCoaches + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
