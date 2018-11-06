package example.liskov;

import java.awt.Graphics;

public class DesenhistaR {

	private Graphics g;

	public DesenhistaR(Graphics graphics) {
		this.g = graphics;
	}

	public void desenhar(FormaGeometrica formaGeometrica) {
		formaGeometrica.desenhar(g);
	}
}
