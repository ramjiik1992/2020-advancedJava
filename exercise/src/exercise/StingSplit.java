package exercise;

public class StingSplit {
public static void main(String[] args) {
  
  String input="'1''2''3'";
  
  
  
  String output []= input.substring(1, input.length()-1).split("''");
  //String output [] =input1.split("''");
  
  
  for (int i = 0; i < output.length; i++) {
    System.out.println(output[i]);
  }
  System.out.println();
}
}
