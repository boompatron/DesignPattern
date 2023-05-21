package org.example.JavaDesignPatternEssentials.Vehicle.Car;

import org.example.JavaDesignPatternEssentials.Engine.Engine;
import org.example.JavaDesignPatternEssentials.Vehicle.AbstractVehicle;

public abstract class AbstractCar extends AbstractVehicle {

	public AbstractCar(Engine engine){
		this(engine, Colour.UNPAINTED);
	}

	public AbstractCar(Engine engine, Colour colour) {
		super(engine, colour);
	}
}
