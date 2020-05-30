package exercise;

import java.util.ArrayList;
import java.util.List;

public class StringJoin {
public static void main(String[] args) {
  
  List<Integer> numbers= new ArrayList<Integer>();
  
  
 // numbers.add("1");
  //numbers.add("2");
  
//  String joined =String.join("','", numbers);
  
  String joined1 =org.apache.commons.lang.StringUtils.join(numbers, "','");
  
  
//  System.out.println(joined);
  
  System.out.println(joined1);
  
 }
}
