package com.nit.Assignment_11mcq;

public class Animal3_5 {

}class fox5 extends Animal { }
class q31
{
      public void doStuff(Animal a) 
      {
           System.out.println("In the Animal version");
      }
      public void doStuff(fox5 h) 
      {
           System.out.println("In the Horse version");
      }
      public static void main (String [] args) 
      {
            q31 q = new q31();
            Animal ob1 = new Animal();
            Animal ob2 = new fox5();
            q.doStuff(ob1);
            q.doStuff(ob2);
     }
}
