package com.xworkz.lambdaeexpression;

public class MultiArgTester {
	public static void main(String[] args)
	{
MultiArg m2=(color,size) -> System.out.println("color" +color+ "size" +size);
		
		m2.multiArg("blue",23);
	}

}
