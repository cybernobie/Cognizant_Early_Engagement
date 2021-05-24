package com.cts.engineAnalysis;

public class PetrolEngine extends Engine {
    @Override
    public int getPerformance() {
        return (getTorque() * getRpm()) / 5252;
    }
}
