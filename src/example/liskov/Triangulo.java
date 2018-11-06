package example.liskov;

import java.awt.Graphics;
import java.awt.Point;

public class Triangulo implements FormaGeometrica {
	private Point v1;
	private Point v2;
	private Point v3;

	public Triangulo(Point v1, Point v2, Point v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public void desenhar(Graphics g) {
		g.fillPolygon(getXs(), getYs(), 3);
	}
	
	public int[] getXs() {
		return new int[] { (int) v1.getX(), (int) v2.getX(), (int) v3.getX() };
	}

	public int[] getYs() {
		return new int[] { (int) v1.getY(), (int) v2.getY(), (int) v3.getY() };
	}
}
