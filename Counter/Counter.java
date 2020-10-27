package GUI;


import javax.swing.SwingUtilities;

public class Counter {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
              new SwingCounter("Counter"); //Constructor

            }
        });
    }

    
}
