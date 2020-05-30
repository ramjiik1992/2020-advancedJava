package exercise.sortingalgorithms;

public class InsertionSort {
public static void main(String[] args) {
  int a[]= {3, 5, 7, 8, 4, 2, 1, 9, 6};
  

  for (int i = 1; i < a.length; i++) {
    
    int current =a[i];
    int j= i-1;
    
    while(j>=0 && current<a[j]) {
      a[j+1]= a[j];
      j--;
    }
    System.out.println(".."+a[j+1] +".."+current);
    a[j+1]=current;
  }
  
  for(int i:a) {
    System.out.print(i);
  }
}
}
