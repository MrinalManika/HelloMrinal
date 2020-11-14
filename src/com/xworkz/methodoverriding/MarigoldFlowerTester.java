package com.xworkz.methodoverriding;

public class MarigoldFlowerTester {
	public static void main(String[] args)
	{
		MarigoldFlower mf=new MarigoldFlower();
		mf.type="asexual";
		mf.reproductive=false;
		mf.color="orange";
		mf.form="semi double";
		mf.Displaydetails();
		mf.Smell();
		
		
	}
}
