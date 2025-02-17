package com.nit.Assignment_11mcq;

/*Method overriding MCQ*/


public class Question_1 {
	
	    public static void main(String[] args) {
	        System.out.println(doStuff());
	        
	    }
	    static boolean doStuff()
	    {
	        for (int x=0;x<5;x++)
	        System.out.println("in for loop");
	        return true; 
	    }
	    
	}

/*OUTPUT :- in for loop
in for loop
in for loop
in for loop
in for loop
true*/

