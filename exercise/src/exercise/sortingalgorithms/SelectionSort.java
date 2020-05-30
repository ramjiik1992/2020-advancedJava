package exercise.sortingalgorithms;

public class SelectionSort {
public static void main(String[] args) {
  
  int arr[]= {2,4,1,7,3,9};
  
  
  for(int i=0;i<arr.length-1;i++) {
    int minElement=i;
    //take one element
    for(int j=i+1;j<arr.length;j++) {
      
      if(arr[j]<arr[minElement]) {
        minElement=j;
      }
    }
    
    System.out.println("min element.."+arr[minElement]);
      int temp=arr[minElement];
      arr[minElement]=arr[i];
      arr[i]=temp;
      
   
  }
  
  for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
  }
  
}
}
