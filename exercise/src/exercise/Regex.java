package exercise;

import java.util.regex.Pattern;

public class Regex {

  public static void main(String[] args) {
    
 Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+.*)?");
    
    String signalValue="429496629.6 dB/Hz";
    if (signalValue != null && !signalValue.isEmpty() 
        &&  pattern.matcher(signalValue.trim()).matches()) {
    System.out.println("matched");
    }else {
      System.out.println("not matched");
    }
  }
}
