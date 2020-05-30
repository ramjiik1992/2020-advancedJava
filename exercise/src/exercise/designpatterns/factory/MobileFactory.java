package exercise.designpatterns.factory;

public class MobileFactory extends ElectronicsFactory{

  @Override
  Mobile getMobile(String type) {
    if(type.equalsIgnoreCase("sony")) {
      return new Sony();
    }else if(type.equalsIgnoreCase("google")) {
      return new Google();
    }else {
      return null;
    }
  }

  
}
