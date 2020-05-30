package exercise;

import java.util.Arrays;
import java.util.List;

public class Peek {
public static void main(String[] args) {
//Creating a list of Integers 
  List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10); 

  // Using peek without any terminal 
  // operation does nothing. Hence this 
  // code will produce no output. 
  list.stream().peek(System.out::println).sorted(); 
}
}
