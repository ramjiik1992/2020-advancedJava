package swt.startup.controller;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SwtController {


  Display display;

  Shell shell;


  public SwtController() {

    display = new Display();

    shell = new Shell(display);

    shell.setVisible(true);

    addItems();
    
    keepOpen(display, shell);

  }

  public void addItems() {
    Button b = new Button(shell, 0);
    b.setText("HI");
    b.setBounds(100, 100, 80, 100);

    Button b1 = new Button(shell, 0);
    b1.setText("FRIEND");
    b1.setBounds(200, 100, 80, 100);

  }
  
  public void keepOpen(Display display, Shell shell) {
    while (!shell.isDisposed()) {
      if (!display.readAndDispatch())
        display.sleep();
    }
  }

}
