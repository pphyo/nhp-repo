package com.pphyo.oop.abst;

// do all the things that concrete class can do
// can more write the abstract method
public abstract class Animal {

	private String color;
	private String species;

	public Animal(String color, String species) {
		super();
		this.color = color;
		this.species = species;
	}

	public String getColor() {
		return color;
	}

	public String getSpecies() {
		return species;
	}
	
	public abstract void eat();

}
