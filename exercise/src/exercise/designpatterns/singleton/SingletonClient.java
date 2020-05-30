package exercise.designpatterns.singleton;

public class SingletonClient {
public static void main(String[] args) {
  
  SingleTon s=  SingleTon.getInstance();
  
  s.display();
}
}
