package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) {
        BufferedWriter writer ;
        BufferedReader reader ;
        try {
            ServerSocket socket = new ServerSocket(6601);
            while (true)
            {
                Socket sc = socket.accept();
                Client client = new Client(sc) ;

                Thread thread = new Thread(client) ;
                thread.start();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
