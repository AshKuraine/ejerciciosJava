package main.java.plano;

import java.util.Scanner;

public class App {
    // Variable global para almacenar instancias de Punto
    private static Punto[] puntos = new Punto[100];
    private static int contadorPuntos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Crear un punto");
            System.out.println("2. Calcular distancia desde el origen");
            System.out.println("3. Calcular distancia entre dos puntos");
            System.out.println("4. Verificar si tres puntos están alineados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearPunto(scanner);
                    break;
                case 2:
                    calcularDistanciaDesdeOrigen(scanner);
                    break;
                case 3:
                    calcularDistanciaEntrePuntos(scanner);
                    break;
                case 4:
                    verificarAlineacion(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void crearPunto(Scanner scanner) {
        System.out.print("Ingrese la coordenada X: ");
        double x = scanner.nextDouble();
        System.out.print("Ingrese la coordenada Y: ");
        double y = scanner.nextDouble();

        puntos[contadorPuntos] = new Punto(x, y);
        contadorPuntos++;
        System.out.println("Punto creado y almacenado.\n");
    }

    private static void calcularDistanciaDesdeOrigen(Scanner scanner) {
        System.out.print("Ingrese el índice del punto: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < contadorPuntos) {
            double distancia = puntos[indice].distanciaDesdeOrigen();
            System.out.println("Distancia desde el origen: " + distancia + "\n");
        } else {
            System.out.println("Índice inválido.\n");
        }
    }

    private static void calcularDistanciaEntrePuntos(Scanner scanner) {
        System.out.print("Ingrese el índice del primer punto: ");
        int indice1 = scanner.nextInt();
        System.out.print("Ingrese el índice del segundo punto: ");
        int indice2 = scanner.nextInt();

        if (indice1 >= 0 && indice1 < contadorPuntos && indice2 >= 0 && indice2 < contadorPuntos) {
            double distancia = Punto.calcularDistancia(puntos[indice1], puntos[indice2]);
            System.out.println("Distancia entre los puntos: " + distancia + "\n");
        } else {
            System.out.println("Índices inválidos.\n");
        }
    }

    private static void verificarAlineacion(Scanner scanner) {
        System.out.print("Ingrese el índice del primer punto: ");
        int indice1 = scanner.nextInt();
        System.out.print("Ingrese el índice del segundo punto: ");
        int indice2 = scanner.nextInt();
        System.out.print("Ingrese el índice del tercer punto: ");
        int indice3 = scanner.nextInt();

        if (indice1 >= 0 && indice1 < contadorPuntos &&
            indice2 >= 0 && indice2 < contadorPuntos &&
            indice3 >= 0 && indice3 < contadorPuntos) {
            boolean alineados = Punto.estanAlineados(puntos[indice1], puntos[indice2], puntos[indice3]);
            System.out.println("Los puntos están alineados: " + alineados + "\n");
        } else {
            System.out.println("Índices inválidos.\n");
        }
    }
}