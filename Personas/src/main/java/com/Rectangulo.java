package main.java.com;
import java.util.Scanner;

class Rectangulo {
    private double ancho;
    private double alto;
    private static int contadorRectangulos = 0;

    // Constructor
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorRectangulos++;
    }

    // Método para calcular el área
    public double area() {
        return ancho * alto;
    }

    // Método para calcular el perímetro
    public double perimetro() {
        return 2 * (ancho + alto);
    }

    // Método para imprimir el área
    public void imprimirArea() {
        System.out.println("Área: " + area());
    }

    // Método para imprimir el perímetro
    public void imprimirPerimetro() {
        System.out.println("Perímetro: " + perimetro());
    }

    // Método estático para obtener el número total de rectángulos creados
    public static int obtenerTotalRectangulos() {
        return contadorRectangulos;
    }

    // Menú interactivo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangulo rectangulo = null;

        while (true) {
            System.out.println("\n--- Menú de Rectángulos ---");
            System.out.println("1. Crear un nuevo rectángulo");
            System.out.println("2. Mostrar el área del rectángulo");
            System.out.println("3. Mostrar el perímetro del rectángulo");
            System.out.println("4. Mostrar el número total de rectángulos creados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ancho: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Ingrese el alto: ");
                    double alto = scanner.nextDouble();
                    rectangulo = new Rectangulo(ancho, alto);
                    System.out.println("¡Rectángulo creado con éxito!");
                    break;
                case 2:
                    if (rectangulo != null) {
                        rectangulo.imprimirArea();
                    } else {
                        System.out.println("Primero debe crear un rectángulo.");
                    }
                    break;
                case 3:
                    if (rectangulo != null) {
                        rectangulo.imprimirPerimetro();
                    } else {
                        System.out.println("Primero debe crear un rectángulo.");
                    }
                    break;
                case 4:
                    System.out.println("Total de rectángulos creados: " + Rectangulo.obtenerTotalRectangulos());
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}