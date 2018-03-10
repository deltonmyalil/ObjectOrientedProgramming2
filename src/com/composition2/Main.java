package com.composition2;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5); //dimensions is passed to theCase below
	    Case theCase = new Case("CoolerMasterGaming","Cooler Master","Corsair VS550",dimensions);
//	    Resolution nativeResolution = new Resolution(1920,1080);
//	    Monitor monitor = new Monitor("Eyefinity","Dell",22, nativeResolution);
//      //// Instead of the above two stmts, you can directly do it as the following
        Monitor monitor = new Monitor("Eyefinity", "Dell", 22, new Resolution(1920,1080));
        Motherboard motherboard = new Motherboard("ROGM3","ASUS",4,2,"AMBIOSv2.6");

        PC thePC = new PC(theCase, monitor, motherboard);  //Using the composition1
        thePC.powerUp();
    }
}
