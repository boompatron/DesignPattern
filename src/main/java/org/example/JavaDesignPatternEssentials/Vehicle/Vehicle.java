package org.example.JavaDesignPatternEssentials.Vehicle;

import org.example.JavaDesignPatternEssentials.Engine.Engine;

public interface Vehicle {
	public enum Colour {UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW}

	public Engine getEngine();
	public Vehicle.Colour getColour();
	public void paint(Vehicle.Colour colour);
}
