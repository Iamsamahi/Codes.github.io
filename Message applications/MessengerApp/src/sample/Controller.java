package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class Controller {
    BufferedReader reader;
    BufferedWriter writer;

    boolean isConnected = false;

    public Controller() {


    }


    @FXML
    Button button;

    @FXML
    TextField nameField;

    @FXML
    TextArea showField ;

    @FXML

    public void buttonPressed()
    {
        if (!isConnected)
        {
            String inputName = nameField.getText();
            if (inputName == null || inputName.length()==0)
            {
               showField.setText("Please Enter Your Text\n");
               return;
            }

            try
            {
                Socket socket = new Socket("LocalHost", 6601);




                OutputStreamWriter o = new OutputStreamWriter(socket.getOutputStream()) ;
                writer = new BufferedWriter(o) ;
                writer.write(inputName+"\n");
                writer.flush();

                InputStreamReader isr = new InputStreamReader(socket.getInputStream()) ;
                reader = new BufferedReader(isr) ;

                Thread serverListener = new Thread()
                {

                    @Override
                    public void run()
                    {

                        while (true)
                        {

                            try
                            {
                                String text = reader.readLine()+"\n";
                                showField.appendText(text);
                            }
                            catch (Exception e)
                            {
                               e.printStackTrace();
                            }

                        }
                    }
                };

                serverListener.start();


                showField.setText("Connection Established\n");
                button.setText("Send");
                nameField.clear();
                nameField.setPromptText("Write Here");
                isConnected =true ;


            } catch (Exception e)


                {
                  e.printStackTrace();

                }


        }else {
            try {

                String msg = nameField.getText();
                if (msg == null || msg.length() == 0)
                {
                    return;
                }
                writer.write(msg+"\n");
                writer.flush();

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
