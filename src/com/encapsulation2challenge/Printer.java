package com.encapsulation2challenge;

// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean isDuplex;

	public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
		if(tonerLevel>0 && tonerLevel<=100)
			this.tonerLevel = tonerLevel;
		this.pagesPrinted = pagesPrinted;
		this.isDuplex = isDuplex;
	}

	public void fillToner(int percentVolume) {
		if(this.tonerLevel + percentVolume <= 100)
			this.tonerLevel += percentVolume;
		else {
			System.out.println("Overflow is wasted");
			this.tonerLevel = 100;
		}
		System.out.println("Current toner level is " + tonerLevel);
	}

	public void printPage(int numberOfPages) {
		this.pagesPrinted += numberOfPages;
		System.out.println(numberOfPages + " additional pages printed. Resulting in a total of " + pagesPrinted + " pages printed");
		int numberOfPapersUsed;
		if(isDuplex)
			numberOfPapersUsed = numberOfPages/2+numberOfPages%2;
		else
			numberOfPapersUsed = numberOfPages;
		System.out.println("Number of A4-papers used is " + numberOfPapersUsed);
	}
}
