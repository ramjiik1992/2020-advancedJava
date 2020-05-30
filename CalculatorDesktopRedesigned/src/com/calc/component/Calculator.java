package com.calc.component;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import com.calc.listener.CalcFrameListener;
import com.calc.listener.CalculatorButtonListener;

public class Calculator {

  
  public Calculator(){
    createFrame();
  }

  public void createFrame() {

    Frame calcFrame = new Frame("Calculator");
    calcFrame.setSize(300, 300);
    calcFrame.setLayout(new BorderLayout());

    TextField f = new TextField(30);
    f.setText("0");

    calcFrame.add(f,BorderLayout.NORTH);


    Panel opertions = new Panel();

    opertions.setLayout(new GridLayout(5,1));

    String[] operationElements =
      {"%",  "X",  "-", "+", "="};
    
    for (int i = 0; i < operationElements.length; i++) {
      Button b = new Button("     "+operationElements[i]+"     ");
      b.addActionListener(new CalculatorButtonListener(f));
      opertions.add(b);
    }

    calcFrame.add(opertions,BorderLayout.EAST);
  
    Panel numbers = new Panel();

    numbers.setLayout(new GridLayout(4,1,4,2));
    
    String[] elements =
        {"7", "8", "9", "4", "5", "6","1", "2", "3", "+/-", "0", "."};

    for (int i = 0; i < elements.length; i++) {

      Button b = new Button(elements[i]);
      b.addActionListener(new CalculatorButtonListener(f));
      numbers.add(b);

    }

    calcFrame.add(numbers,BorderLayout.CENTER);

    calcFrame.setVisible(true);
    calcFrame.addWindowListener(new CalcFrameListener());
  }

}
