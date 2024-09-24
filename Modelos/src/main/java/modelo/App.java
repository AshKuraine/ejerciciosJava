package main.java.modelo;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione la figura geométrica que desea crear:");
            System.out.println("1. Rectángulo");
            System.out.println("2. Triángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el ancho del rectángulo:");
                    double ancho = scanner.nextDouble();
                    System.out.println("Ingrese el alto del rectángulo:");
                    double alto = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(ancho, alto);
                    rectangulo.imprimirDatos();
                    break;

                case 2:
                    System.out.println("Ingrese la base del triángulo:");
                    double base = scanner.nextDouble();
                    System.out.println("Ingrese la altura del triángulo:");
                    double altura = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(base, altura);
                    triangulo.imprimirDatos();
                    break;

                case 3:
                    System.out.println("Ingrese el radio del círculo:");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    circulo.imprimirDatos();
                    break;

                case 4:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}