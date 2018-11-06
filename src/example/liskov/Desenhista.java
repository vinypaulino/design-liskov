package example.liskov;
import java.awt.Graphics;

public class Desenhista {

	private Graphics graphics;

	public Desenhista(Graphics graphics) {
		this.graphics = graphics;
	}

	public void desenhar(FormaGeometrica formaGeometrica) {
		if (formaGeometrica instanceof Retangulo) {
			Retangulo retangulo = (Retangulo) formaGeometrica;
			graphics.fillRect(retangulo.getX(), retangulo.getY(), retangulo.getLargura(), retangulo.getAltura());
		} else if (formaGeometrica instanceof Circulo) {
			Circulo circulo = (Circulo) formaGeometrica;
			graphics.fillOval(circulo.getX(), circulo.getY(), circulo.getRaio(), circulo.getRaio());
		} else if (formaGeometrica instanceof Triangulo) {
			Triangulo triangulo = (Triangulo) formaGeometrica;
			graphics.fillPolygon(triangulo.getXs(), triangulo.getYs(), 3);
		}
	}
}
