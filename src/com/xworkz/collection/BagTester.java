package com.xworkz.collection;

import java.util.ArrayList;

public class BagTester {
	public static void main(String[] args)
	
	{
		Bag b1=new Bag("leather","brown", 3);
		Bag b2 =new Bag("hand", "white", 2);
		Bag b3 =new Bag("carry", "red", 5);
		
		ArrayList<Bag> bag=new ArrayList<Bag>();
		 bag.add(b1);
		 bag.add(b2);
		 bag.add(b3);
		
		 
		 System.out.println(bag);
		 
		 System.out.println();
		 
		 System.out.println("===========================");
		 
		System.out.println("using enhanced for loop");
		for(Bag b:bag)
		System.out.println(bag);
		System.out.println();
		
		System.out.println("====================");
		System.out.println("using For Each loop");
		
		
		bag.forEach((n)->System.out.println(n));
		System.out.println();
		
		System.out.println("display last element");
		
		System.out.println(bag.get(bag.size()-1));
		
		System.out.println("upate 3 element");
		
		Bag b4 = null;
		bag.set(3, b4);
		System.out.println(bag);
		Bag b6 = null;
		bag.add(0, b6);
		System.out.println(bag);
		

	}


	}


