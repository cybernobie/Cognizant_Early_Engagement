package com.cts.engineAnalysis;

public abstract class Engine {

	private int torque;
	private int rpm;
	private String fuel;

	public int getTorque() {
		return torque;
	}

	public void setTorque(int torque) {
		this.torque = torque;
	}

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public abstract int getPerformance();

}
