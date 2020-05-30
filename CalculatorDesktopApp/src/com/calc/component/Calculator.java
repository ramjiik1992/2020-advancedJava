package com.calc.component;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import com.calc.listener.CalcFrameListener;
import com.calc.listener.CalculatorButtonListener;

public class Calculator {


  public void createFrame() {

    Frame calcFrame = new Frame("Calculator");
    calcFrame.setSize(300, 300);
    calcFrame.setLayout(new FlowLayout());

    TextField f = new TextField(30);
    f.setText("0");

    calcFrame.add(f);


    Panel p = new Panel();

    p.setLayout(new GridLayout(4, 2, 7, 4));

    String[] elements =
        {"7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+", "C", "0", "%", "="};

    for (int i = 0; i < elements.length; i++) {

      Button b = new Button(elements[i]);
      b.addActionListener(new CalculatorButtonListener(f));
      p.add(b);

    }

    calcFrame.add(p);

    calcFrame.setVisible(true);
    calcFrame.addWindowListener(new CalcFrameListener());
  }

}
