package com.calc.formlayout;


import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import com.calc.ControlBuilder;
import com.calc.UIBuilder;

public class EmailFormBuilder implements UIBuilder {

    @Override
    public void build(Composite parent) {
        // TODO Auto-generated method stub
        
        System.out.println("Building the Email Form..."+parent);
//      RowLayout layout=new RowLayout(SWT.VERTICAL);
//      layout.marginLeft=20;
//      layout.marginTop=20;
//      layout.spacing=20;
        
        
        FormLayout layout=new FormLayout();
        parent.setLayout(layout);
        
        
        //parent.setLayoutData(layout);
        
        ControlBuilder builder=new ControlBuilder(parent);
        
        
        Label fromLabel = builder.label("From").get(Label.class);
        Text fromTextBox = builder.text().get(Text.class);
        
        Label toLabel = builder.label("To").get(Label.class);
        Text toTextBox = builder.text().get(Text.class);
        
        Label subjectLabel = builder.label("Subject").get(Label.class);
        Text subjectTextBox = builder.text().get(Text.class);
        
        
        Label messageLabel = builder.label("Message").get(Label.class);
        Text messageTextBox = builder.text().get(Text.class);
        
        Button sendCopyCheckBox= builder.checkBox("Send Me A Copy").get(Button.class);
        
        Button sendButton=builder.button("Send").get(Button.class);
        
        
        
        //Let us arrange the control in FormLayout
        FormData fromLabelData=new FormData();
        fromLabelData.left=new FormAttachment(5); //10% from left border
        fromLabelData.top=new FormAttachment(5);   //5% from top border
        fromLabel.setLayoutData(fromLabelData);
        
        
        FormData fromTextBoxData=new FormData(200,20);
        fromTextBoxData.left=new FormAttachment(fromLabel, 20);  //a gap of 10% between label end and textbox start
        fromTextBoxData.top=new FormAttachment(5);
        fromTextBoxData.right=new FormAttachment(50); //60% gap
        fromTextBox.setLayoutData(fromTextBoxData);
        
        
        //To label data
        FormData toLabelData=new FormData();
        toLabelData.left=new FormAttachment(5); //10% from left border
        toLabelData.top=new FormAttachment(15);   //5% from top border
        toLabel.setLayoutData(toLabelData);
        
        
        FormData toTextBoxData=new FormData(200,20);
        toTextBoxData.left=new FormAttachment(toLabel, 44);  //a gap of 10% between label end and textbox start
        toTextBoxData.top=new FormAttachment(13);
        toTextBoxData.right=new FormAttachment(50); //60% gap
        toTextBox.setLayoutData(toTextBoxData);
       
        
        //To label data
        FormData subjectLabelData=new FormData();
        subjectLabelData.left=new FormAttachment(5); //10% from left border
        subjectLabelData.top=new FormAttachment(20);   //5% from top border
        subjectLabel.setLayoutData(subjectLabelData);
        
        
        FormData subjectTextBoxData=new FormData(200,20);
        subjectTextBoxData.left=new FormAttachment(subjectLabel, 22);  //a gap of 10% between label end and textbox start
        subjectTextBoxData.top=new FormAttachment(20);
        subjectTextBoxData.right=new FormAttachment(50); //60% gap
        subjectTextBox.setLayoutData(subjectTextBoxData);
       
        
        //To label data
        FormData messageLabelData=new FormData();
        messageLabelData.left=new FormAttachment(5); //10% from left border
        messageLabelData.top=new FormAttachment(30);   //5% from top border
        messageLabel.setLayoutData(messageLabelData);
        
        
        FormData messageTextBoxData=new FormData(200,100);
        messageTextBoxData.left=new FormAttachment(messageLabel, 18);  //a gap of 10% between label end and textbox start
        messageTextBoxData.top=new FormAttachment(40);
        messageTextBoxData.right=new FormAttachment(50); //60% gap
        messageTextBox.setLayoutData(messageTextBoxData);
       

        
        //To label data
        FormData checkLabelData=new FormData();
        checkLabelData.left=new FormAttachment(5); //10% from left border
        checkLabelData.top=new FormAttachment(80);   //5% from top border
        sendCopyCheckBox.setLayoutData(checkLabelData);

        
        FormData sendButtonData=new FormData(250,50);
        sendButtonData.right=new FormAttachment(98);
        sendButtonData.bottom=new FormAttachment(98);
        sendButton.setLayoutData(sendButtonData);
        
        
                
        
        
        
                
                
        
    }

}
