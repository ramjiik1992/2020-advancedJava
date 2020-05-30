package com.taskmanager.builder;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import com.taskmanager.utils.Application;
import com.taskmanager.utils.ControlBuilder;
import com.taskmanager.utils.Form;
import com.taskmanager.utils.UIBuilder;



public class TaskManagerFormBuilder implements UIBuilder {

  boolean dirtyFlag = false; // true means unsaved data!

  @Override
  public void build(Composite parent) {

    FormLayout layout = new FormLayout();
    parent.setLayout(layout);

    ControlBuilder builder = new ControlBuilder(parent);


    // <————— Create the controls ————>
    Label titleLabel = builder.label("Task title").get(Label.class);
    Text titleTextBox = builder.textField().get(Text.class);

    Label detailsLabel = builder.label("Task Details").get(Label.class);
    Text detailsTextBox = builder.textField().get(Text.class);


    Label taskStateLabel = builder.label("Task State").get(Label.class);

    Combo taskStates = builder.combo(0, "Not started", "In Progress", "Completed").get(Combo.class);


    Button createButton=builder.button("Create").get(Button.class);

    // <————— Set the Layout ————>
    Form.data().left(5).top(5).applyTo(titleLabel);
    Form.data(200, 20).left(titleLabel, 10).top(5).right(50).applyTo(titleTextBox);

    Form.data().left(5).top(15).applyTo(detailsLabel);
    Form.data(200, 90).left(detailsLabel, 60, SWT.LEFT).right(50).top(detailsLabel, 20)
        .applyTo(detailsTextBox);

    Form.data().left(5).top(47).applyTo(taskStateLabel);
    Form.data(200, 20).left(taskStateLabel, 10).right(30).top(detailsTextBox, 18)
        .applyTo(taskStates);
    
    Form.data().left(90).top(80).applyTo(createButton);

    
      createButton.addListener(SWT.Selection, new Listener() {
      
      @Override public void handleEvent(Event arg0) { // TODO Auto-generated method stub
      System.out.println("creating task..."); 
      String title=titleTextBox.getText(); 
      String details=detailsTextBox.getText(); 
      String taskState=taskStates.getText(); 
      
      dirtyFlag=false; //mail is sent. so don't worry. nothing is unsaved 
      Shell shell=Application.instance.getShell(); 
     
       Control[] c=  shell.getShell().getParent().getChildren();
      
       Combo cc= (Combo) c[1];
       cc.setItems(title);
       cc.select(0);
       
      } });


  }

}
