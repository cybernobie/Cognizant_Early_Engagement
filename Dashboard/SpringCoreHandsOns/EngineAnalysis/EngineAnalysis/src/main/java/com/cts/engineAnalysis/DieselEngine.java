package com.cts.engineAnalysis;

public class DieselEngine extends Engine {

	// Type your code here
	public int getPerformance() {

		return super.getTorque() * super.getRpm() / 63025;
	}
}
