package org.example.JavaDesignPatternEssentials.Vehicle.Van;

import org.example.JavaDesignPatternEssentials.Engine.Engine;

public class PickUp extends AbstractVan {
	public PickUp(Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public PickUp(Engine engine, Colour colour) {
		super(engine, colour);
	}
}
