package exercise.trysortingtechnique;

public class SelectionSort {
public static void main(String[] args) {
  
  int a[] = {2,6, 3, 7, 4, 5,1};
  
  int pointer=0;
  boolean sorted =false;
  
  while(!sorted && pointer <a.length) {
  
    sorted =true;
    int min=pointer;
    for (int i = pointer; i < a.length ; i++) {
      
      if(a[i]<a[min]) {
        min=i;
      }
     
    }
    
    if(min!=a.length) {
      sorted=false;
    }
    int temp =a[pointer];
    a[pointer]=a[min];
    a[min]=temp;
    pointer++;
  }
  
  
  
  //System.out.println("min of array .."+min);

    
     for (int i = 0; i < a.length; i++) { System.out.print(a[i]); }
    
}
}
