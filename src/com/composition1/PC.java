package com.composition1;

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

	public Case getTheCase() {
		return theCase;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}
}
