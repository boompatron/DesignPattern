package org.example.JavaDesignPatternEssentials.Vehicle.Van;

import org.example.JavaDesignPatternEssentials.Engine.Engine;
import org.example.JavaDesignPatternEssentials.Vehicle.AbstractVehicle;

public abstract class AbstractVan extends AbstractVehicle {

	public AbstractVan(Engine engine){
		this(engine, Colour.UNPAINTED);
	}

	public AbstractVan(Engine engine, Colour colour) {
		super(engine, colour);
	}
}
