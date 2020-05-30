package exercise;

import java.io.IOException;

public class Crptocheck {
public static void main(String[] args) {
  
  String[] cmd = {"bash", "-c",
  "openssl enc -aes-256-cbc -nosalt -d -in C:\\Users\\ramji\\Desktop\\summary.enc -out C:\\Users\\ramji\\Desktop\\summary.csv -K 73656c616874 -iv 656e69767269"};
  
  Runtime r = Runtime.getRuntime();
  try {
    Process p = r.exec(cmd);
  } catch (IOException e) {
    System.out.println("e***" + e.toString());
    e.printStackTrace();
  }
}
}
