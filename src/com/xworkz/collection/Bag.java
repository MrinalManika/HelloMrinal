package com.xworkz.collection;

public class Bag {
	String brand;
	String color;
	int capacity;
	public Bag() {
		System.out.println("default bag constructor");
	}
	public Bag(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "UPS [brand=" + brand + ", color=" + color + ", capacity=" + capacity + "]";
	}

}
