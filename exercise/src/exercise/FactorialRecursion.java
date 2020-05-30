package exercise;

public class FactorialRecursion {
  
  public static int fact(int n) {
    
    if(n==1) {
      return 1;
    }else if(n==0) {
      return 0;
    }else {
      return n*fact(n-1);
    }
  }
  
public static void main(String[] args) {
  
  int result = fact(3);
  
  System.out.println("result "+result);
  
}
}
