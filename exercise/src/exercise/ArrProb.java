package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrProb {
public static void main(String[] args) {
  
  int arr[] = new int[]{20, 40, 50, 40,40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
  
  Map<Integer,Integer> m= new HashMap<>();
  
  for(int i=0;i<arr.length;i++) {
    
    if(m.containsKey(arr[i])) {
      
      int count =m.get(arr[i]);
      count++;
      m.put(arr[i],count);
    }
    else {
      m.put(arr[i],1);
    }
   
  }
  
  for(Entry<Integer, Integer> entry:m.entrySet()) {
    
    if(entry.getValue()%2==1) {
      System.out.println(entry.getKey());
    }
  }
}
}
