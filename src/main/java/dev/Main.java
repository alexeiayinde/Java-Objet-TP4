package dev;

import java.awt.Point;

public class Main {

	public static void main(String[] args) {

		Carre carre1 = new Carre(new Point(0, 0), 5);
		Rectangle rect1 = new Rectangle(new Point(1, 1), 3, 5);
		Rectangle rect2 = new Rectangle(new Point(2, 2), 4, 4);
		Cercle cercle1 = new Cercle(new Point(1, 1), 7);

		System.out.println("Même origine ? " + cercle1.memeOrigine(rect1));
		System.out.println("Même origine ? " + cercle1.memeOrigine(carre1));

		System.out.println("Ce rectangle est-il un carré ? " + rect1.estCarre());
		System.out.println("Ce rectangle est-il un carré ? " + rect2.estCarre());

		System.out.println(carre1);
		System.out.println(rect1);
		System.out.println(rect2);
		System.out.println(cercle1);

	}

}
