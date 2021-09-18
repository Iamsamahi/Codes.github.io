package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;

public class Client implements Runnable{
    String clientName ;
    BufferedReader reader ;
    BufferedWriter writer ;

    final static ArrayList<Client>clients = new ArrayList<>() ;

    Client(Socket sc){


        try {

            InputStreamReader isr = new InputStreamReader(sc.getInputStream()) ;
            reader = new BufferedReader(isr) ;



            OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream()) ;
            writer = new BufferedWriter(o) ;
            clientName = reader.readLine() ;
            clients.add(this) ;
            System.out.println(clientName + " connected");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run()
    {

        while (true)
        {
            try {
                String data = reader.readLine() ;
                data = clientName + ": " + data + "\n";
                synchronized (clients) {
                    for (Client client : clients) {
                        client.writer.write(data);
                        client.writer.flush();
                    }
                }

            } catch(SocketException e){
                break;
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
