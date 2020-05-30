package exercise;

public class FindDuplicate {
public static void main(String[] args) {
  
  int a[] = {3,2,4,2,3,1,1,8,4};
  
 
  int distinct=0;
  for (int i = 0; i < a.length; i++) {
    
    boolean isDistinct=true;
    for (int j = 0; j < i; j++) {
      
      if(a[i]==a[j] ) {
        isDistinct=false;
        break;
      }
    }
    
    if(isDistinct) {
      distinct=a[i];
    }
  }
  
  System.out.println("distinct number.."+distinct);
}
}
