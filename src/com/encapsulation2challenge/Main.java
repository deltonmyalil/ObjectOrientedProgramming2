package com.encapsulation2challenge;

public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer(20,3,true);
		printer.fillToner(30);
		printer.fillToner(80);
		printer.printPage(60);
	}
}
