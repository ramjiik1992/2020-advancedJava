package exercise.designpatterns.Decorator;

public class IceCreamClient {

  public static void main(String[] args) {
    
    IceCream baseIceCream = new BasicIceCream();
    
 System.out.println("base icecream cost "+ baseIceCream.cost());
  
  IceCream vennila = new VenillaIceCream(baseIceCream); //wrapping venilla over base icecream
  
 System.out.println("adding venilla cost "+ vennila.cost());
  
  }
}
