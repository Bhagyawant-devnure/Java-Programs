package com.nit.Assignment_11mcq;

public class Question_6 {
	 public static void main(String[] argv) 
     {
            System.out.println(calc(1, 2));
            System.out.println(calc(1.1F, 2.2F));
     }
     public static int calc(int a, int b) 
     {
            System.out.println("int");
            return a + b;
     }
     public static float calc(float a, float b) 
     {
            System.out.println("float");
            return a + b;
     }
}

