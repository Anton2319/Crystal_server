package com.company;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class server implements Runnable {
   public void run (){
        int port = 4050;
        System.out.println("Crystal server v. 0.01 development");
        System.out.println("Hello, world!");
        Scanner scanner = new Scanner(System.in);
            try {
            ServerSocket servers = new ServerSocket(port);
            System.out.println("[INFO] Port 4050 is free!");
        } catch (IOException e) {
            System.out.println("[ERROR] Couldn't listen to port 4050");
            System.exit(-1);
        }
        ServerSocket servers = null;
        Socket fromclient = null;
            System.out.println("[INFO] prepairing server...");
            System.out.println("[DEBUG]"+servers);
            System.out.println("[INFO] Waiting for a client...");
            System.out.println("Enter your commands here:");
        String command = null;
        commandlistener cmdcommand = new commandlistener();
        while(true) {
            try {
                fromclient = servers.accept();
                System.out.println("[INFO] Client connected");
                // hmm... Is it works?
                //this code was writed without compilation
                try {
                //clientAccept(fromclient);
                }
                catch (Exception e) {
                 
                }
                

            }
            catch (Exception e) {

            }
        }
    }
    // don't touch my trash! I did not test it!
    public void clientAccept(Socket fromclient) {
        BufferedReader in;
        PrintWriter out;
        in = new BufferedReader(new InputStreamReader(fromclient.getInputStream()));
        out = new PrintWriter(fromclient.getOutputStream(),true);
    }
}
