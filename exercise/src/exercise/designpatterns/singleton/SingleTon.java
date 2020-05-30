package exercise.designpatterns.singleton;

public class SingleTon {
  
  private static SingleTon s ;
  

  private SingleTon() {
    
  }
  
  void display() {
    System.out.println("calling singleton method");
  }
  
  public static SingleTon getInstance() {
    
    if(s == null) {
     return  s= new SingleTon();
    }else
    {
      return s;
    }
  }
  
  public static SingleTon getDoubleCheckGetInstance() {
    
    if(s ==null) {
      synchronized (SingleTon.class) {
        if(s==null) {
          s = new SingleTon();
        }
      }
    }
    return s;
  }
  
}
