package exercise;

public class TwoDArray {
public static void main(String[] args) {
  
  int a[][]=new int [2][3];
  
  int[][] arr = { {1, 1, 1, 1},  {2, 2, 2, 2},  {3, 3, 3, 3} };
  
  System.out.println(".."+arr[0].length);
  
  System.out.println("column length"+a[1].length);
  System.out.println(a.length);
  
  int counter=1;
  for (int i = 0; i < a.length; i++) {
    for (int j = 0; j < a.length+1; j++) {
      
      a[i][j] =counter;
    
      counter++;
    }
    
  }
  
  System.out.println("hello");
}
}
