package main.java.libreria;

import java.util.Scanner;

public class App {
    private static Libro[] libros = new Libro[10]; // Arreglo para almacenar los libros
    private static int contadorLibros = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Crear un nuevo libro");
            System.out.println("2. Imprimir detalles de todos los libros");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    if (contadorLibros < libros.length) {
                        Libro libro = new Libro();
                        System.out.print("Ingresa el título del libro: ");
                        libro.setTitulo(scanner.nextLine());
                        System.out.print("Ingresa el autor del libro: ");
                        libro.setAutor(scanner.nextLine());
                        System.out.print("Ingresa el número base de páginas: ");
                        int numero = scanner.nextInt();
                        libro.setPaginas(numero);

                        libros[contadorLibros] = libro;
                        contadorLibros++;
                    } else {
                        System.out.println("No se pueden agregar más libros.");
                    }
                    break;

                case 2:
                    imprimirTodosLosLibros();
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }

    private static void imprimirTodosLosLibros() {
        System.out.println("Libros disponibles:");
        for (int i = 0; i < contadorLibros; i++) {
            System.out.println("- " + libros[i].getTitulo());
        }
    }
}