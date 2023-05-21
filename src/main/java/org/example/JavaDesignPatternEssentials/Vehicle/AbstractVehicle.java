package org.example.JavaDesignPatternEssentials.Vehicle;

import org.example.JavaDesignPatternEssentials.Engine.Engine;

public abstract class AbstractVehicle implements Vehicle {

	private Engine engine;
	private Vehicle.Colour colour;

	public AbstractVehicle(Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public AbstractVehicle(Engine engine, Colour colour) {
		this.engine = engine;
		this.colour = colour;
	}

	@Override
	public Engine getEngine() {
		return engine;
	}

	@Override
	public Colour getColour() {
		return colour;
	}

	@Override
	public void paint(Colour colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " (" + engine + ", " + colour + ")";
	}
}
