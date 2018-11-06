package example.liskov;

import java.awt.Graphics;

public class Circulo implements FormaGeometrica {
	private int x;
	private int y;
	private int raio;

	public Circulo(int x, int y, int raio) {
		this.x = x;
		this.y = y;
		this.raio = raio;
	}
	
	public void desenhar(Graphics graphics) {
		graphics.fillOval(x, y, raio, raio);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

}
