import modelos.Circulo;
import modelos.Figura;
import modelos.Rectangulo;
import modelos.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);
        Figura triangulo = new Triangulo(3.0, 4.0, 3.0, 4.0, 5.0);

        Figura[] figuras = { circulo, rectangulo, triangulo };

        for (Figura figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            figura.dibujar();
            System.out.println();
        }
    }
}