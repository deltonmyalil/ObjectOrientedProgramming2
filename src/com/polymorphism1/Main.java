package com.polymorphism1;

class Movie {
	private String name;

	public Movie(String name) {
		this.name = name;
	}

	public String plot() {
		return "No plot here";
	}

	public String getName() {
		return name;
	}
}

class Avengers extends Movie {
	public Avengers() {
		super("Avengers");
	}

	@Override
	public String plot() {
		return "Earth\'s mightiest heroes assemble to close the hole in ozone layer";
	}
}

class SpiderMan extends Movie {
	public SpiderMan() {
		super("Spider-man");
	}

	@Override
	public String plot() {
		return "Man in spandex shoots sticky stuff out of his body";
	}
}

class Xmen extends Movie {
	public Xmen() {
		super("X-Men");
	}

	@Override
	public String plot() {
		return "Earth's weirdest heroes fight against each other. DEADPOOL WAS HERE";
	}
}

class StarWars extends Movie {
	public StarWars() {
		super("Star Wars");
	}

	@Override
	public String plot() {
		return "Space Nazis let by Darth Hitler blows up planets";
	}
}

class Forgettable extends Movie {
	public Forgettable() {
		super("I dont remember");
	}
	//No overriden plot method here
}

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie No." + i + ": " + movie.getName() + "\n" + "Plot: "+movie.plot()+"\n");
		}
	}

	public static Movie randomMovie() {
		int randomNumber = (int) (Math.random()*5+1); //Math.random returns double b/w 0 and 1. Hence cast it to int. Then mul by 5 and add 1 to that to get between 1 and 5
		System.out.println("Random generated is " + randomNumber);
		switch (randomNumber) {
			case 1:
				return new Avengers(); //returning object of type Movie. Hence use new to make object
			case 2:
				return new SpiderMan(); // no need of break as it is returning
			case 3:
				return new Xmen();
			case 4:
				return new StarWars();
			case 5:
				return new Forgettable();
			default:
				return null;
		}
	}
}

