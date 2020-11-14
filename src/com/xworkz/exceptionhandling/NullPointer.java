package com.xworkz.exceptionhandling;

public class NullPointer {
	public static void main (String[] args)     { 
      
        String myStr = null; 
          
        try   { 
             myStr=null;    
                System.out.print("Two strings are same"); 
            } 
        catch (NullPointerException e) {
        	System.out.println("valid");
			
		} 
			 System.out.print("Caught NullPointerException"); 
        } 
	}




