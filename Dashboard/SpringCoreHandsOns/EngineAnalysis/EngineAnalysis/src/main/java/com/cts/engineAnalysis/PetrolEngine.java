package com.cts.engineAnalysis;

public class PetrolEngine extends Engine {

	// Type your code here
	public int getPerformance() {

		return super.getTorque() * super.getRpm() / 5252;
	}
}