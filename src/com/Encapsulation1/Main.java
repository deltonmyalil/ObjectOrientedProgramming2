package com.Encapsulation1;
//This shows what happens without encapsulation
//This is not the right way of doing it
//Eg: If Player class's name variable got renamed to something else, it would create an error here
//The right way of doing it is shown in the class EnhancedPlayer
public class Main {
	public static void main(String[] args) {
//		Player player = new Player();
//		player.name = "Deltroid";
//		player.health = 20;
//		player.weapon = "M4A-16";
//
//		int damage = 10;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
//
//		damage = 11;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());

		//The above is commented out as it works with the wrong class - ie Player
		//The below code is working with the encapsulated class EnhancedPlayer

		EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Delton", 50, "M40");
		System.out.println("Initial Health is " + enhancedPlayer.getHitPoints());
	}
}
