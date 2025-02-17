package com.nit.Assignment_11mcq;

public class Animal {
	  String name;
      Animal(String name) 
      {
             this.name = name;
      }
      Animal() 
      {
             this(makeRandomName());// Corrected: Now calling a static method
      }
      static String makeRandomName() // Made this method static
      {
             String name = "i";
             return name;
      }
      public static void main (String [] args) 
      {
             Animal a = new Animal();
             System.out.println(a.name);
             Animal b = new Animal("Zeus");
             System.out.println(b.name);

}}
