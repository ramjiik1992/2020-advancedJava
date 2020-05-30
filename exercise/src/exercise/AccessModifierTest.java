package exercise;

import exercise.accessmodifier.PrivateModifier;

public class AccessModifierTest {

  public static void main(String[] args) {
    
    PrivateModifier p=new PrivateModifier();
    System.out.println(p.name);
    
    //System.out.println(p.gender);
  
    AccessModifierTest aa= new AccessModifierTest();
    //System.out.println(aa.name);
  }
  
}
