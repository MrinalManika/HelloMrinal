package com.xworkz.methodoverriding;

public class Flower {
	String type;
	boolean reproductive;
	
	public Flower()
	{
		System.out.println("default flower constructor");
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isReproductive() {
		return reproductive;
	}
	public void setReproductive(boolean reproductive) {
		this.reproductive = reproductive;
	}
	
	void Pluck()
	{
		System.out.println("Used to pluck the flower");
	}
	void Smell()
	{
		System.out.println("smelling the flower purify our mind");
	}
	void Displaydetails() {
		System.out.println(" type : \"+type+\"reproductive : \"+reproductive");
	}
}


