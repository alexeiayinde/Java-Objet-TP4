package dev;

import java.awt.Point;

public final class Carre extends Forme {

	private int cote;

	public Carre(Point centre, int cote) {
		super(centre);
		this.cote = cote;
	}

	@Override
	public float getAire() {
		return cote * cote;
	}

	@Override
	public float getPerimetre() {
		return cote * 4;
	}

	@Override
	public String getType() {
		return "Carré";
	}

}
