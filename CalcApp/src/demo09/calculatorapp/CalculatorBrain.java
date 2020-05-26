package demo09.calculatorapp;

import demo09.calculatorapp.models.CalculatorDigitClickListener;
import demo09.calculatorapp.models.CalculatorOperatorClickListner;
import demo09.calculatorapp.models.DisplayChangeListener;

public class CalculatorBrain implements CalculatorDigitClickListener, CalculatorOperatorClickListner {
	
	DisplayChangeListener displayChangeListner;
	
	
	public DisplayChangeListener getDisplayChangeListner() {
		return displayChangeListner;
	}

	public void setDisplayChangeListner(DisplayChangeListener displayChangeListner) {
		this.displayChangeListner = displayChangeListner;
	}

	double first; //first value
	
	double second; //a second value is added to the result
	
	boolean isFirst=true;
	boolean isDecimalAdded=false; //decimal has not been added
	String operation;
	
	public double getValue() {
		if(isFirst)
			return first;
		else
			return second;
	}
	
	public void setValue(double value) {
		if(isFirst)
			first=value;
		else
			second=value;
	}

	

	@Override
	public void digitClicked(String digit) {
		//System.out.println("Recieved :"+digit);
		if(displayChangeListner!=null)
			displayChangeListner.updateDisplay(digit);
		
		setValue(Long.parseLong(digit));		
		isFirst=false;
		
	}

	@Override
	public void operatorClicked(String operator) {
		// TODO Auto-generated method stub
		//System.out.println("Received operator:"+operator);
		if(displayChangeListner!=null)
			displayChangeListner.updateDisplay(operator);
		
		if(!operator.equalsIgnoreCase("=")) {
		  operation=operator;
		}else {
		  
		  PerformOperation op= new PerformOperation(operation, first, second);
		  displayChangeListner.updateDisplay (String.valueOf(op.calculate()));
		  
		}
		
	}

}
