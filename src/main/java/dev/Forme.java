package dev;

import java.awt.Point;

public abstract class Forme {

	protected Point centre;

	public Forme(Point centre) {
		this.centre = centre;
	}

	public abstract float getAire();

	public abstract float getPerimetre();

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public boolean memeOrigine(Forme forme) {
		return this.centre.equals(forme.getCentre());
	}

	@Override
	public String toString() {
		return "Aire de la forme : " + this.getAire() + "\nPérimètre de la forme : " + this.getPerimetre() + "\n";
	}
}
