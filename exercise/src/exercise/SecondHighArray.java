package exercise;

public class SecondHighArray {
  
  

  public static void main(String[] args) {
    int highest=0;
    int shighest=0;
    int[] arr={7,5,7,1,4,2};
    
    for(int i=0;i<arr.length;i++) {
      
      if(arr[i]>highest) {
        shighest=highest;
        highest=arr[i];
      }else if(arr[i]>shighest && arr[i]!=highest) {
        shighest=arr[i];
      }
      
    }
    
    System.out.println(highest);
    System.out.println(shighest);
  }
}
