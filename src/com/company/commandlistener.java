package com.company;

import java.util.Scanner;

public class commandlistener implements Runnable{
    public void run () {
        Scanner scanner = new Scanner(System.in);
        String command;
        command = scanner.nextLine();
        if(command == "stop") {
            System.out.println("[INFO] stopping server...");
            System.exit(0);
        }
        //System.out.println("[INFO] stopping server...");
    }
}
