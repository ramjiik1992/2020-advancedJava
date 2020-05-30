package com.main;

import java.awt.Button;
import java.awt.Frame;

public class Main {
public static void main(String[] args) {
  
 Frame f=new Frame();
 f.setSize(800, 600);
 
 f.setVisible(true);
 
 Button b= new Button("click");
 b.setSize(10, 10);
 
 f.add(b);
 
 
}
}
