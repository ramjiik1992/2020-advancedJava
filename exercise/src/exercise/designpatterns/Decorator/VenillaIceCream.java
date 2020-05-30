package exercise.designpatterns.Decorator;

public class VenillaIceCream extends IceCreamDecorator{

  

  public VenillaIceCream(IceCream iceCream) {
    super(iceCream);
    // TODO Auto-generated constructor stub
  }

  @Override
  public int cost() {
    return super.cost()+50;
    
  }
}
