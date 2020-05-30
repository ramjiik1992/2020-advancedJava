package exercise.trysortingtechnique;

public class BubbleSortAnotherWay {
public static void main(String[] args) {

  int a[] = {1, 6, 3, 7, 4, 5};




  
  for (int j = 0; j < a.length; j++) {
  
    
    for (int i = 0; i < a.length-1; i++) {
      if (a[i] >  a[j]) {

        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
        
      }

    }
  }



   
    
    

  for (int i = 0; i < a.length; i++) {
    System.out.print(a[i]);
  }
}

}

