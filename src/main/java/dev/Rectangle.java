package dev;

import java.awt.Point;

public final class Rectangle extends Forme {

	private int longueur;
	private int largeur;

	public Rectangle(Point centre, int longueur, int largeur) {
		super(centre);
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public float getAire() {
		return longueur * largeur;
	}

	@Override
	public float getPerimetre() {
		return longueur * 2 + largeur * 2;
	}

	public boolean estCarre() {
		return this.longueur == this.largeur;
	}

	@Override
	public String getType() {
		return "Rectangle";
	}

}
