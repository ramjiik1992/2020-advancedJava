package exercise.trysortingtechnique;

public class BubbleSort {

  public static void main(String[] args) {


    int a[] = {1, 6, 3, 7, 4, 5};



    boolean sorted = false;

    while (!sorted) {

      sorted=true;

      for (int i = 0; i < a.length-1; i++) {
        if (a[i] > a[i + 1]) {

          int temp = a[i];
          a[i] = a[i + 1];
          a[i + 1] = temp;
          
          sorted =false;
        }

      }
      
      
    }



    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
    }
  }
}
