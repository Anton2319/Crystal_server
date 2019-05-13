package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Starting server, please wait...");
		Thread t = new Thread(new server());
		t.start();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String command = scanner.nextLine();
			if (command.equals("stop")) {
				System.out.println("[INFO] stopping server...");
				System.exit(0);
			}
			if (command.equals("restart")) {
				System.out.println("[INFO] reloading server...");
				t.start();
			}
			if (command.equals("?") || command.equals("help")) {
				System.out.println("[HELP]");
				System.out.println("stop - stopping server");
				System.out.println("restart - reloading server");
				System.out.println("help or ? - commands list");
			}
			if (command.equals("?")==false || command.equals("help")==false || command.equals("stop")==false || command.equals("restart")==false) {
				System.out.println("[INFO] unknown command, to see commands list type help or ?");
			}
		}
	}
}
