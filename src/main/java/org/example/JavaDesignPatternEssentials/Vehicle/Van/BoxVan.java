package org.example.JavaDesignPatternEssentials.Vehicle.Van;

import org.example.JavaDesignPatternEssentials.Engine.Engine;

public class BoxVan extends AbstractVan {
	public BoxVan(Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public BoxVan(Engine engine, Colour colour) {
		super(engine, colour);
	}
}
