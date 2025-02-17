package com.nit.Assignment_11mcq;

public class Animal2 {

}
class Horse extends Animal { }
class q30
{
      public void doStuff(Animal a) 
      {
           System.out.println("In the Animal version");
      }
      public void doStuff(Horse h) 
      {
           System.out.println("In the Horse version");
      }
      public static void main (String [] args) 
      {
            q30 q = new q30();
            Animal ob1 = new Animal();
            Horse ob2 = new Horse();
            q.doStuff(ob1);
            q.doStuff(ob2);
     }
}
