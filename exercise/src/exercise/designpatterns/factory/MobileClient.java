package exercise.designpatterns.factory;

public class MobileClient {
public static void main(String[] args) {
  
  MobileFactory fact = new MobileFactory();
  
  fact.getMobile("sony").build();

  fact.getMobile("google").build();
}
}
