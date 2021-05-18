package com.cts.engineAnalysis;

public class Car {

	private String name;
	private Engine engine;

	// Constructor for constructor-injection
	public Car(String name, Engine engine) {
		super();
		this.name = name;
		this.engine = engine;
	}

	// Type your code here

	public void getReport() {

		// Type your code here
		System.out.println(
				name + " car with " + engine.getFuel() + " engine gives " + engine.getPerformance() + " horsepower");
	}

}
