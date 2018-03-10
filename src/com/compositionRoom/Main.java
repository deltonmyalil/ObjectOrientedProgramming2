package com.compositionRoom;

public class Main {
	public static void main(String[] args) {
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");

		Ceiling ceiling = new Ceiling(12, "white");

		Bed bed = new Bed("Wooden",2, 15, 2, 1);

		Lamp lamp = new Lamp("table Lamp", false, 60);
//Making a bedroom using composition

		BedRoom bedRoom = new BedRoom("Delton's room", wall1,wall2,wall3, wall4,ceiling,bed, lamp);
		bedRoom.makeBed();
		bedRoom.getLamp().turnON();
	}
}
