package exercise;

import java.util.List;

public class ArraySort {

  public static void main(String[] args) {
    
    int arr[]= {3,4,2,1,5};
    List.of(1,2,3,4);
    
    int temp=0;
    for (int i=0;i<arr.length;i++) {
      
      for(int j=i+1;j<arr.length;j++) {
        
        if(arr[i]>arr[j]) {
          
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
      
    }
    
  for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
  }
  }
  
  
  
  
}
