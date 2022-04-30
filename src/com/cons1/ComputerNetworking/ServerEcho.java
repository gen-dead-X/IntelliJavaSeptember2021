package com.cons1.ComputerNetworking;

import java.util.*;
import java.io.*;
import java.net.*;

public class ServerEcho {
    public static void main(String[] args) throws IOException {
        ServerSocket sr = new ServerSocket(1235);

        System.out.println("Server is Ready!");
        Socket client = sr.accept();
        System.out.println("1 Client Connected!");

        PrintStream ps = new PrintStream(client.getOutputStream());
        Scanner scanner = new Scanner(client.getInputStream());

        while(true){
            String st = scanner.nextLine();
            ps.println(st);
            if(st.equals("exit") == true)
                System.exit(1);
            System.out.println("Server Returns : " + scanner);
        }
    }
}
