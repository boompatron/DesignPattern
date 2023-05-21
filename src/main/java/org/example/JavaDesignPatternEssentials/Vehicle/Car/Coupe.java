package org.example.JavaDesignPatternEssentials.Vehicle.Car;

import org.example.JavaDesignPatternEssentials.Engine.Engine;
import org.example.JavaDesignPatternEssentials.Vehicle.Car.AbstractCar;

public class Coupe extends AbstractCar {

	public Coupe(Engine engine){
		this(engine, Colour.UNPAINTED);
	}

	public Coupe(Engine engine, Colour colour){
		super(engine, colour);
	}
}
