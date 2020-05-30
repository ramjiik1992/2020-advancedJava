package exercise;

import java.util.regex.Pattern;

public class NumberCheck {
  
  static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
  
  public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false; 
    }
    return pattern.matcher(strNum).matches();
}
  
public static void main(String[] args) {
  
  String s="1.232 ";
  
  
System.out.println( isNumeric(s));
}

}
