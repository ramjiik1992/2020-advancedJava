package swt.startup;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Hello {
public static void main(String[] args) {
  
  
  Display d= new Display();
  
  Shell s= new Shell(d);
  s.setText("Hello SWT");
  s.setSize(300, 300);
  
  Button b= new Button(s, 10);
  
  
  
  s.setVisible(true);
  
  while(!s.isDisposed()) {
    if(!d.readAndDispatch())
      d.sleep();
  }
}
}
