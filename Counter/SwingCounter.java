package GUI;

import javax.swing.*;


import java.awt.event.*;
import java.awt.*;

public class SwingCounter extends JFrame { 
   public JTextField textField ;
    public JButton button,button1 ;
    public JLabel label;
    
    public SwingCounter(String name) {
        super(name) ;
        Container cp = getContentPane() ; // all component will be added to the Top Container 
        cp.setLayout(new FlowLayout());
        cp.setBackground(Color.ORANGE);
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField = new JTextField("0");
        button = new JButton("Count");
       	button1 = new JButton("Reset");
       
     
        label = new JLabel("Counter");
        cp.add(label);
        cp.add(textField);
        cp.add(button);
	    cp.add(button1);
        textField.setEditable(false);
        setVisible(true);	
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==button){
                    String num = textField.getText();
                     int count = Integer.parseInt(num);
                     count++;
                     textField.setText(count + "");
                }
             }
        });

        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==button1){
                    textField.setText("0");
                }

            }
            
        });
        
        }
    }


     
    
        
    


    
