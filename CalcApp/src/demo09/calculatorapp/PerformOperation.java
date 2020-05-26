package demo09.calculatorapp;

public class PerformOperation {

  String operator;
  double firstValue;
  double secondValue;
  
  

  PerformOperation(String operator, double firstValue, double secondValue) {

    this.operator=operator;
    this.firstValue=firstValue;
    this.secondValue=secondValue;
  }
  
  protected double calculate() {
    

    if (operator.equalsIgnoreCase("+")) {

      return firstValue+secondValue;
    }

    if (operator.equalsIgnoreCase("-")) {
      return firstValue-secondValue;
    }

    if (operator.equalsIgnoreCase("*")) {
      return firstValue*secondValue;
    }

    if (operator.equalsIgnoreCase("%")) {
      return firstValue/secondValue;
    }
    return 0.0;

  }
}
