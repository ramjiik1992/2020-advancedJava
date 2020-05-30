package exercise.tasks;

import java.util.Scanner;

public class ArrayTask {
  static int a[]=new int[5];
  
  public int[] getIntegers() {
   
    
    System.out.println("enter array elements");
    Scanner s=new Scanner(System.in);
    
    for (int i=0;i<a.length;i++) {
      a[i]=s.nextInt();
    }
    return a;
  }
  
  public void printArray(int []a) {
    System.out.println("printing array elements");
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
  
  public int [] sortArray(int a[]) {
    System.out.println("sorting array elements");
    int temp;
    boolean flag=true;
    while(flag) {
    flag=false;
      for (int i = 0; i < a.length-1; i++) {
        
        if(a[i]<a[i+1]) {
          temp=a[i];
          a[i]=a[i+1];
          a[i+1]=temp;
          flag=true;
        }
      
    }
    }
    return a;
  }
  
public static void main(String[] args) {
  
ArrayTask t= new ArrayTask();

t.getIntegers();
t.printArray(a);
t.sortArray(a);
t.printArray(a);
  
 
}
}
