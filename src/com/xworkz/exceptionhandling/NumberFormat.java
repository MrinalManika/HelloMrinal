package com.xworkz.exceptionhandling;

public class NumberFormat {
public static void main(String[] args) {
		
		int marks[]=new int[3];
		marks[0]=12;
		marks[1]=28;
		marks[3]=35;
		marks[4]=85;
		
		try {
			System.out.println("inside try block");
			for(int i=0;i<=marks.length;i++) {
				System.out.println("marks "+marks[i]);
			}
			System.out.println("end of try block");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Try within limit");
		}

	}

}



