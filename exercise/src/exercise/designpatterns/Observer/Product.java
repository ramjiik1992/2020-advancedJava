package exercise.designpatterns.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Product extends Observable {

  private List<Observer> observerList = new ArrayList<Observer>();
  
  private String name;
  
  private String availability;

  
  public Product( String name, String availability) {
    super();
    this.name = name;
    this.availability = availability;
  }

  public List<Observer> getObserverList() {
    return observerList;
  }

  public void setObserverList(List<Observer> observerList) {
    this.observerList = observerList;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
    notifyObservers(this, availability);
  }
  
  
  public void notifyObservers(Observable ob,String availability) {

    for (Observer o :observerList) {
      o.update(ob, this.availability);
    }
}
  
  public void register(Observer ob) {
    observerList.add(ob);
  }
  
}
