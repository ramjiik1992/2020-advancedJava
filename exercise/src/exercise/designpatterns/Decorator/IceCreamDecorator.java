package exercise.designpatterns.Decorator;

public class IceCreamDecorator implements IceCream{

  private IceCream iceCream;
  
  
  public IceCreamDecorator(IceCream iceCream) {
    System.out.println("");
    this.iceCream=iceCream;
    //super();
  }



  @Override
  public int cost() {
    return this.iceCream.cost();
  }
  
  
}
