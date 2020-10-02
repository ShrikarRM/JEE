package com.account.metro;

public class Education {

	private static Education online=null;
	private Education(){
		System.out.println(this.getClass().getName()+" Online");
	}
	
	public static Education getObject(){
		if(online==null){
			online=new Education();
		}
		return online;
	}
}
