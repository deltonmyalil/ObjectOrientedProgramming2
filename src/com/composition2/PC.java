package com.composition2;

//Defining that PC has a mB, Case, Monitor etc, we create classes for the same and define them
//This is composition1

public class PC {
	private Case theCase; //case is a keyword
	private Monitor monitor;
	private Motherboard motherboard;

	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public void powerUp() {
		getTheCase().pressPowerButton();
		drawLogo();
	}

	private void drawLogo() {
		System.out.println("Logo of " + motherboard.getManufacturer());
		monitor.drawPixelAt(143,423,"yellow");
	}

	private Case getTheCase() {
		return theCase;
	}

	private Monitor getMonitor() {
		return monitor;
	}

	private Motherboard getMotherboard() {
		return motherboard;
	}
}
