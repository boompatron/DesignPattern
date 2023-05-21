package org.example.JavaDesignPatternEssentials.Vehicle.Car;

import org.example.JavaDesignPatternEssentials.Engine.Engine;
import org.example.JavaDesignPatternEssentials.Vehicle.Car.AbstractCar;

public class Sport extends AbstractCar {
	public Sport(Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public Sport(Engine engine, Colour colour) {
		super(engine, colour);
	}
}
