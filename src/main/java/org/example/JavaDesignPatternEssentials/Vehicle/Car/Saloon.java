package org.example.JavaDesignPatternEssentials.Vehicle.Car;

import org.example.JavaDesignPatternEssentials.Engine.Engine;
import org.example.JavaDesignPatternEssentials.Vehicle.Car.AbstractCar;

public class Saloon extends AbstractCar {
	public Saloon(Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public Saloon(Engine engine, Colour colour) {
		super(engine, colour);
	}
}
