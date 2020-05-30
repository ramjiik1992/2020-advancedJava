package exercise.designpatterns.Decorator;

public class BasicIceCream implements IceCream{

  
  
  public BasicIceCream() {
  System.out.println("creating base icecream");
  }

  @Override
  public int cost() {
    //System.out.println("basic icecream cost"+50);
    return 50;
  }

  
}
