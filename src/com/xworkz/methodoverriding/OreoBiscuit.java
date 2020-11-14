package com.xworkz.methodoverriding;

public class OreoBiscuit extends Biscuit {
	String manufacturer;
	boolean cream;
	
	@Override
	void sweet()
	{
		System.out.println("biscuit is sweet...");
	}
	

}
