package com.polymorphism2;

// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

class Car {
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.engine = true;
		this.wheels = 4;
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}

	public String startEngine() {
		return getClass().getSimpleName() + " " + getName() + "--> startEngine()";
	}

	public String accelerate() {
		return getClass().getSimpleName() + " " + getName() + "--> accelerate()";
	}

	public String brake() {
		return getClass().getSimpleName() + " " + getName() + "--> brake()";
	}
}

class Mitsubishi extends Car {
	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return getClass().getSimpleName() + " " + getName() + "--> startEngine()";
	}

	@Override
	public String accelerate() {
		return getClass().getSimpleName() + " " + getName() + "--> accelerate()";
	}

	@Override
	public String brake() {
		return getClass().getSimpleName() + " " + getName() + "--> brake()";
	}
}

class Ford extends Car {
	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return getClass().getSimpleName() + " " + getName() + "--> startEngine()";
	}

	@Override
	public String accelerate() {
		return getClass().getSimpleName() + " " + getName() + "--> accelerate()";
	}

	@Override
	public String brake() {
		return getClass().getSimpleName() + " " + getName() + "--> brake()";
	}
}

public class Main {
	public static void main(String[] args){
		Car car = new Car(8,"Generic Car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());

		Mitsubishi lancer = new Mitsubishi(6,"Lancer");
		System.out.println(lancer.startEngine());
		System.out.println(lancer.accelerate());
		System.out.println(lancer.brake());

		Ford ford = new Ford(4,"Figo");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
	}
}