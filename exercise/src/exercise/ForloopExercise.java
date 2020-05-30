package exercise;

public class ForloopExercise {
public static void main(String[] args) {
  
  int sum = 0;
  int count = 0;
  for(int i=1 ;i<1000 && count <5;i++) {
    
    if(i%3==0 && i%5==0) {
      System.out.println("number dividable by 3 and 5 .."+i);
      sum = sum+i;
      count++;
    }
    
  }
  
  System.out.println("total sum "+sum);
}
}
