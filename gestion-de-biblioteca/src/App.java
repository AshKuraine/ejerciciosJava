import java.util.Scanner;

import biblioteca.Biblioteca;
import biblioteca.Libro;
import biblioteca.Pelicula;
import biblioteca.Revista;

public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú Biblioteca:");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Agregar Revista");
            System.out.println("3. Agregar Película");
            System.out.println("4. Mostrar Catálogo");
            System.out.println("5. Prestar Item");
            System.out.println("6. Devolver Item");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String tituloLibro = scanner.nextLine();
                    System.out.print("Ingrese el autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el número de páginas: ");
                    int paginas = scanner.nextInt();
                    Libro libro = new Libro(tituloLibro, autor, paginas);
                    biblioteca.agregarItem(libro);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la revista: ");
                    String nombreRevista = scanner.nextLine();
                    System.out.print("Ingrese el número de edición: ");
                    int edicion = scanner.nextInt();
                    System.out.print("Ingrese la cantidad de ejemplares: ");
                    int ejemplares = scanner.nextInt();
                    Revista revista = new Revista(nombreRevista, edicion, ejemplares);
                    biblioteca.agregarItem(revista);
                    break;
                case 3:
                    System.out.print("Ingrese el título de la película: ");
                    String tituloPelicula = scanner.nextLine();
                    System.out.print("Ingrese el director: ");
                    String director = scanner.nextLine();
                    System.out.print("Ingrese la duración (minutos): ");
                    int duracion = scanner.nextInt();
                    Pelicula pelicula = new Pelicula(tituloPelicula, director, duracion);
                    biblioteca.agregarItem(pelicula);
                    break;
                case 4:
                    biblioteca.mostrarCatalogo();
                    break;
                case 5:
                    System.out.print("Ingrese el título del item a prestar: ");
                    String tituloPrestar = scanner.nextLine();
                    biblioteca.prestarItem(tituloPrestar);
                    break;
                case 6:
                    System.out.print("Ingrese el título del item a devolver: ");
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverItem(tituloDevolver);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 7);

        scanner.close();
    }
}