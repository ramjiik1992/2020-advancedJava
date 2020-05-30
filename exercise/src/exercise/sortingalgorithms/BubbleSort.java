package exercise.sortingalgorithms;

public class BubbleSort {
public static void main(String[] args) {
  
  int arr[]= {4,5,1,8,7,3,5};
  
  boolean sorted=false;
  while(!sorted) {
    sorted=true;
    for (int i = 0; i < arr.length-1; i++) {
      
      if(arr[i]>arr[i+1]) {
        
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
        
        sorted=false;
      }
    }
    
  }
  
  
  for(int i:arr) {
    System.out.print(i);  
  }
  
}
}
