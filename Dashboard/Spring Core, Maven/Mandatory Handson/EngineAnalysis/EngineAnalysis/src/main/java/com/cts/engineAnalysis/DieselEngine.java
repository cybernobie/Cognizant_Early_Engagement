package com.cts.engineAnalysis;

public class DieselEngine extends Engine {
    @Override
    public int getPerformance() {
        return (getTorque() * getRpm()) / 63025;
    }
}
