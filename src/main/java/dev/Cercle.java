package dev;

import java.awt.Point;

public final class Cercle extends Forme {

	private int rayon;

	public Cercle(Point centre, int rayon) {
		super(centre);
		this.rayon = rayon;
	}

	@Override
	public float getAire() {
		return 3.14f * rayon * rayon;
	}

	@Override
	public float getPerimetre() {
		return 3.14f * 2 * rayon;
	}

	@Override
	public String getType() {
		return "Cercle";
	}

}
