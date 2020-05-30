package exercise;

import exercise.accessmodifier.ParentClassforOverloading;

public class ChildClassForOverloading extends ParentClassforOverloading{

   protected void add (Double d) {
    System.out.println("add two double numbers");
  }
   
   public static void main(String[] args) {
    
     ParentClassforOverloading s=new ParentClassforOverloading();
     //s.add(33.3d);
  }
}
