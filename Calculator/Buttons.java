package Calculator;

import javax.swing.* ;
import java.awt.event.*;


public class Buttons{
     double a=0, b=0, answer=0;
     int operator = 0;
     JButton button1 = new JButton("1");  // creating objects of button
     JButton button2 = new JButton("2");
     JButton button3 = new JButton("3");
     JButton button4 = new JButton("4");
     JButton button5 = new JButton("5");
     JButton button6 = new JButton("6");
     JButton button7 = new JButton("7");
     JButton button8 = new JButton("8");
     JButton button9 = new JButton("9");
     JButton button0 = new JButton("0");
    JButton plusButton = new JButton("+");
    JButton minusButton = new JButton("-");
    JButton pliesButton = new JButton("*");
    JButton divideButton = new JButton("/");
    JButton equalButton = new JButton("=");
    JButton clearButton = new JButton("AC");
    public JTextField textField = new JTextField();        // textfields references
    public JPanel panel,panel2,panel3,panel4;   //creating panel's references
    
     class ButtonPress implements ActionListener {
        
      

        @Override
        public void actionPerformed(ActionEvent e) { // ActtionListener For Buttons
            if (e.getSource().equals(button0)) {
                textField.setText(textField.getText().concat("0"));
            }
            if (e.getSource() == button1) {
                textField.setText(textField.getText().concat("1"));
            }
            if (e.getSource() == button2) {
                textField.setText(textField.getText().concat("2"));
            }
            if (e.getSource() == button3) {
                textField.setText(textField.getText().concat("3"));
            }
            if (e.getSource() == button4) {
                textField.setText(textField.getText().concat("4"));
            }
            if (e.getSource() == button5) {
                textField.setText(textField.getText().concat("5"));
            }
            if (e.getSource() == button6) {
                textField.setText(textField.getText().concat("6"));
            }
            if (e.getSource() == button7) {
                textField.setText(textField.getText().concat("7"));
            }
            if (e.getSource() == button8) {
                textField.setText(textField.getText().concat("8"));
            }
            if (e.getSource() == button9) {
                textField.setText(textField.getText().concat("9"));
            }
            // Operational Buttons are added below 
            if (e.getSource().equals(plusButton)) {        
                operator=1;
            a=Double.parseDouble(textField.getText());
			textField.setText(" ");
		} 

            
            if (e.getSource().equals(minusButton)) {
            operator = 2 ;
            a = Double.parseDouble(textField.getText());
            textField.setText(" ");                

            }
            if (e.getSource().equals(pliesButton)) {
                operator = 3 ;
                a = Double.parseDouble(textField.getText());
                textField.setText(" "); 

            }
            if (e.getSource().equals(divideButton)) {
                operator = 4 ;
                a = Double.parseDouble(textField.getText());
                textField.setText(" "); 

            }
            if (e.getSource().equals(equalButton)) {
                b=Double.parseDouble(textField.getText());
		
			// switch(operator)
			// {
			// 	case 1: answer =a+b;
			// 		break;
		
			// 	case 2: answer =a-b;
			// 		break;
		
			// 	case 3: answer=a*b;
			// 		break;
		
			// 	case 4: answer=a/b;
			// 		break;
		
			// 	default: textField.setText("Error");
			// }
		
            // textField.setText("" + answer );
            if(e.getSource().equals(plusButton)){
                answer = a+b ;
                textField.setText(answer+"");
            }

            }
            if (e.getSource() == clearButton) {
                textField.setText(" ");
            }

        }

    }

     }

 
     
