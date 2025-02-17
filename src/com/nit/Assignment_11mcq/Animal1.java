package com.nit.Assignment_11mcq;

public class Animal1 {
	 String name;
     Animal1(String name) 
     {
            this.name = name;
     }
     Animal1() 
     {
            this(makeRandomName());
     }
     static String makeRandomName() 
     {
            String name = "i";
            return name;
     }
     public static void main (String [] args) 
     {
            Animal1 a = new Animal1();
            System.out.println(a.name);
            Animal1 b = new Animal1("Mouse");
            System.out.println(b.name);

}}
