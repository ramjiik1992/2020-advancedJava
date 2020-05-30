package exercise;

public class StringReverse {
  
  public String reverse(String input) {
    
    StringBuilder reversedString = new StringBuilder();
    
    char[]  a= input.toCharArray();
    
    for(int i=a.length-1 ;i>=0;i--) {
      
      reversedString.append(a[i]);
    }
    
    return reversedString.toString();
  }
  
public static void main(String[] args) {
  
  StringReverse reverse = new StringReverse();
  
  String output = reverse.reverse("welcome india");
  
  
  System.out.println(output);
  
  
  
}
}
