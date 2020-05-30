package exercise.trysortingtechnique;

public class InsertionSort {
public static void main(String[] args) {
  int a[] = {7,2,6, 3, 4, 5,1};
  
  
  for (int i = 0; i < a.length; i++) {
    
    
      /*
       * int j=0; while(j<i) {
       * 
       * if(a[i]<a[j]) {
       * 
       * int temp= a[i]; a[i]=a[j]; a[j]=temp; } j++; }
       */
    
    int current=i;
    int j=i-1;
    while(j>=0 && a[current]<a[j]) {
      
      int temp= a[j];
      a[j]=a[current];
      a[current]=temp;
      j--;
      current--;
    }
    
  }
  
  
  for (int i = 0; i < a.length; i++) { System.out.print(a[i]); }
  
}
}

