package exercise.overloadandoverride;

import java.io.IOException;

public class ChildClass extends ParentClass{
  
  private String name;
  
  static void staticCheck() {
    
    //System.out.println(name);
  }

  @Override
  public Integer display() throws IOException {
    return null;
  }
}
