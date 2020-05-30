package exercise.designpatterns.Observer;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {

  
  private String personName;
  
  @Override
  public void update(Observable o, Object arg) {
    System.out.println("Hello.."+personName+ "..product is available status.."+arg);
    
  }

  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public Person(String personName) {
    super();
    this.personName = personName;
  }
  
  

}
