package Calculator;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import java.awt.event.*;
import java.awt.*;

public class SwingCalculator extends Buttons{  //Extending JFrame converts the SwingCalculator class
                                              // into a Frame which contains all JFrame's  objects


   public JFrame frame = new JFrame();

    
    
    public SwingCalculator(){    //Constructor
                          
       
        Container cp = frame.getContentPane();    //Creating cointainer object of the frame
                                            //Frame's default is Borderlayout
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        panel = new JPanel(new BorderLayout());     //Panel's default Layout is converted to BorderLayout  
        frame.setSize(300,400);               //setting frame's size
        
        textField.setPreferredSize(new DimensionUIResource(150,50) ); //setting textfield's size 
        textField.setEditable(true); // Textfield is editable
        panel.add(textField);        // Textfield is added to the Panel

        cp.add(panel,BorderLayout.NORTH); //Panel is added to the Frame's container's top(NORTH) position.
        panel2 = new JPanel(new GridLayout(3,3,3,3)); //Panel two's object is created 
                                                //Panel's Layout is converted to GridLayout
                                                //with row, coloumns , horizontal and vertical gaps
        panel2.add(button7);                    //numerical buttons are added to panel 2       
        panel2.add(button8);
        panel2.add(button9);
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        cp.add(panel2,BorderLayout.CENTER); //Panel 2 is added to the container's center position
                                            // of the main Frame

  
       
        panel3 = new JPanel(new GridLayout(3,2)); //Panel 3 is setted to GridLayout with 3 row's 2 coloumn
        panel3.add(clearButton);            // All operations/functional button's are added to panel 3 
        panel3.add(plusButton);
        panel3.add(minusButton);
        panel3.add(pliesButton);
        panel3.add(divideButton);
        panel3.add(equalButton);
        cp.add(panel3,BorderLayout.EAST);  //Panel 3 is added to the container's EAST position
                                            // of the main Frame
        panel4 = new JPanel(new BorderLayout());
        panel4.add(button0);
        cp.add(panel4, BorderLayout.SOUTH);
        frame.setVisible(true);                //Frame's visiblity is setted as true to show in the display    
        
        
        

        //Actionlistener is added to the each of single Buttons
                                            
        button0.addActionListener(new ButtonPress());
        button1.addActionListener(new ButtonPress());
        button2.addActionListener(new ButtonPress());
        button3.addActionListener(new ButtonPress());
        button4.addActionListener(new ButtonPress());
        button5.addActionListener(new ButtonPress());
        button6.addActionListener(new ButtonPress());
        button7.addActionListener(new ButtonPress());
        button8.addActionListener(new ButtonPress());
        button9.addActionListener(new ButtonPress());
     
        plusButton.addActionListener(new ButtonPress());
        minusButton.addActionListener(new ButtonPress());
        pliesButton.addActionListener(new ButtonPress());
        divideButton.addActionListener(new ButtonPress());
        clearButton.addActionListener(new ButtonPress());
        equalButton.addActionListener(new ButtonPress());


    } // Constructor OF SwingCalculator Ends Here 
    
   
}
  




    
    
    


     



