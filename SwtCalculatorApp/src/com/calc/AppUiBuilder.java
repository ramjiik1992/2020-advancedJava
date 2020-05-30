package com.calc;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class AppUiBuilder implements UIBuilder {

	ControlBuilder builder;
	
	
	@Override
	public void build(Composite parent) {
		GridLayout calculatorGridLayout=new GridLayout();
		calculatorGridLayout.numColumns = 3;
	    parent.setLayout(calculatorGridLayout);
		
		builder=new ControlBuilder(parent);
		
		
		String buttons[]= {"1","2","3","4","5","6","7","8","9","0"};
		
		
		Text t= new Text(parent, SWT.RIGHT);
		
		t.setLayoutData(Grid.data().horizontalStretch().hgrab().hspan(4). get());
		
		
		
		for (String button : buttons) {
          
		  builder
          .button(button);
          
         // .background(255, 0, 0)
         // .setLayoutData(Grid.data(). size(40, 20).vspan(7) .get());
          
		  
        }
    /*
     * builder .button("My Button 1") .background(255, 0, 0) .foreground(255, 255, 255);
     * 
     * 
     * 
     * 
     * builder .button("My Button2") .setLayoutData( Grid .data().stretch().hgrab().vspan(3) .get()
     * );
     */
		
		
    /*
     * Button button3= builder.button("My Button 3").get(Button.class);
     * Grid.data().hspan(2).stretch().applyTo(button3);
     * 
     * 
     * addButtons(parent, 10, "AutoButtons");
     * 
     * builder.button("My Button 4") .setLayoutData( Grid.data().stretch().hspan(4).vgrab() .get()
     * );
     */
		
		
		
		//parent.pack(); //trim to the required size
				
		
	}

	private void addButtons(Composite parentPanel, int buttonCount, String nameBase) {
		for(int i=1;i<=buttonCount;i++) {
			Button button=new Button(parentPanel,SWT.PUSH);
			button.setText(nameBase+i);
			GridData data=new GridData();
			data.horizontalAlignment=SWT.FILL;
			button.setLayoutData(data);
			
			button.addSelectionListener(new SelectionAdapter() {
				
				@Override
				public void widgetSelected(SelectionEvent e) {
					// TODO Auto-generated method stub
					Button btn=(Button) e.getSource();
					Application.instance.setTitle("Button "+btn.getText()+" clicked");
				}
			});
			
		}
	}

}
