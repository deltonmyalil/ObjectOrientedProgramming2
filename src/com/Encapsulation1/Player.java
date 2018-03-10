package com.Encapsulation1;

//This shows what happens without encapsulation

public class Player {
	public String name;  // Note that I am using access specifier as public
	public int health;  //If I rename this to currentHealth, then it will cause an error in the Main class.
	public String weapon;

	public void loseHealth(int damage) {
		this.health -= damage;
		if (this.health <= 0)
			System.out.println("Player Dead");
	}

	public int healthRemaining() {
		return this.health;
	}
}
