package exercise.designpatterns.factory;

public class AbstractElectroonicClient {

  public static void main(String[] args) {
    
    
    ElectronicsFactory ef = new MobileFactory();
    
   Mobile mobile=  ef.getMobile("sony");
     
   mobile.build();
    
  }
}
