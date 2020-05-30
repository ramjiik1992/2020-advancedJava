package exercise.array;

public class FindEven {
  
  public int findNumbers(int[] nums) {
    
    int count=0;
    for(int i=0;i<nums.length;i++){
        int num=nums[i];
        int noOfDigit=0;
        while(num!=0){
            num/=10;
            noOfDigit++;
        }
        
        if(noOfDigit%2==0){
            count++;
        }
    }
    
    return count;
}
  
public static void main(String[] args) {

  int a[]= {437,315,322,431,686,264,442};
  FindEven e= new FindEven();
  System.out.println(e.findNumbers(a));
}
}