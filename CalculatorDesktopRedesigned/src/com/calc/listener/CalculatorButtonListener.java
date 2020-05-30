package com.calc.listener;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorButtonListener implements ActionListener {


  TextField field;

  public CalculatorButtonListener(TextField field) {
    this.field = field;
  }

  @Override
  public void actionPerformed(ActionEvent e) {


    setTextFieldValues(e);
    
    setOperations(e);
    
    performOperations(e);

  }

  public void setTextFieldValues(ActionEvent e) {

    if (field.getText().equals("0")) {
      field.setText("");
    }

    if (e.getActionCommand().equals("1")) {

      field.setText(field.getText() + "1");
    }

    if (e.getActionCommand().equals("2")) {

      field.setText(field.getText() + "2");
    }

    if (e.getActionCommand().equals("3")) {

      field.setText(field.getText() + "3");
    }

    if (e.getActionCommand().equals("4")) {

      field.setText(field.getText() + "4");
    }

    if (e.getActionCommand().equals("5")) {

      field.setText(field.getText() + "5");
    }

    if (e.getActionCommand().equals("6")) {

      field.setText(field.getText() + "6");
    }

    if (e.getActionCommand().equals("7")) {

      field.setText(field.getText() + "7");
    }

    if (e.getActionCommand().equals("8")) {

      field.setText(field.getText() + "8");
    }

    if (e.getActionCommand().equals("9")) {

      field.setText(field.getText() + "9");
    }

    if (e.getActionCommand().equals("0")) {

      field.setText(field.getText() + "0");
    }

    if (e.getActionCommand().equals("C")) {

      field.setText("");
    }

  }
  
  public void setOperations(ActionEvent e) {

    if (e.getActionCommand().equals("+") && !field.getText().contains("+")) {

      field.setText(field.getText() + "+");

    }

    if (e.getActionCommand().equals("-") && !field.getText().contains("-")) {

      field.setText(field.getText() + "-");
    }

    if (e.getActionCommand().equals("x") && !field.getText().contains("x")) {

      field.setText(field.getText() + "x");
    }

    if (e.getActionCommand().equals("%") && !field.getText().contains("%")) {

      field.setText(field.getText() + "%");
    }

  }
  
  public void performOperations(ActionEvent e) {

    if (e.getActionCommand().equals("=")) {


      if (field.getText().contains("+")) {

        String arr[] = field.getText().split("\\+");

        int result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);

        field.setText(String.valueOf(result));
      }

      if (field.getText().contains("-")) {

        String arr[] = field.getText().split("\\-");

        int result = Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]);

        field.setText(String.valueOf(result));
      }

      if (field.getText().contains("x")) {

        String arr[] = field.getText().split("x");

        int result = Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);

        field.setText(String.valueOf(result));
      }

      if (field.getText().contains("%")) {

        String arr[] = field.getText().split("%");

        try {
          int result = Integer.parseInt(arr[0]) / Integer.parseInt(arr[1]);
          field.setText(String.valueOf(result));
        } catch (ArithmeticException ex) {

          field.setText("Cannot divide by zero");


        }

      }

    }
  }
}
