package com.cons1.ComputerNetworking;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientEcho {
    public static void main(String[] args)throws IOException {
        Socket clientsocket = new Socket("127.0.0.1", 1235);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Client is Ready!");

        PrintStream ps = new PrintStream(clientsocket.getOutputStream());
        Scanner sc = new Scanner(clientsocket.getInputStream());

        while(true){
            String st = sc1.nextLine();
            ps.println(st);
            if(st.equals("exit") == true)
                System.exit(1);
            String st1 = sc.nextLine();
            System.out.println("Server Return : " + st1);

        }
    }
}
