package com.compositionRoom;

public class Lamp {
	private String style;
	private boolean batteryPowered;
	private int globRating;

	public Lamp(String style, boolean batteryPowered, int globRating) {
		this.style = style;
		this.batteryPowered = batteryPowered;
		this.globRating = globRating;
	}

	public void turnON() {
		System.out.println("Lamp --> Turning on");
	}

	public String getStyle() {
		return style;
	}

	public boolean isBatteryPowered() {
		return batteryPowered;
	}

	public int getGlobRating() {
		return globRating;
	}
}
