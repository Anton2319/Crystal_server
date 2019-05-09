package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Starting server, please wait...");
		Thread t = new Thread(new server());
		t.start();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String command = scanner.nextLine();
			if (command == " stop") {
				System.out.println("[INFO] stopping server...");
				System.exit(0);
			}
		}
	}
}
