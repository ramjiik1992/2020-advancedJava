package exercise.designpatterns.Observer;

public class ObserverPatternMain {
public static void main(String[] args) {
  
  Person p=new Person("john");
  
  Product product = new Product("mobile",  "not available");

  product.register(p);
  
  System.out.println(product.getObserverList().size());
  
  product.setAvailability("available");
}
}
