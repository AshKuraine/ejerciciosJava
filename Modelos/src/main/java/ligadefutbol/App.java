package main.java.ligadefutbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<Equipo> equipos = new ArrayList<>();
    private static List<Jugador> jugadores = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Crear equipo");
            System.out.println("2. Crear jugador");
            System.out.println("3. Eliminar jugador");
            System.out.println("4. Eliminar equipo");
            System.out.println("5. Mostrar lista de jugadores");
            System.out.println("6. Mostrar lista de equipos");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir nueva línea

            switch (opcion) {
                case 1:
                    crearEquipo();
                    break;
                case 2:
                    crearJugador();
                    break;
                case 3:
                    eliminarJugador();
                    break;
                case 4:
                    eliminarEquipo();
                    break;
                case 5:
                    mostrarJugadores();
                    break;
                case 6:
                    mostrarEquipos();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }

    private static void crearEquipo() {
        System.out.print("Ingresa el nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();
        equipos.add(new Equipo(nombreEquipo));
        System.out.println("Equipo creado exitosamente.");
    }

    private static void crearJugador() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos disponibles. Crea un equipo primero.");
            return;
        }

        System.out.print("Ingresa el nombre del jugador: ");
        String nombreJugador = scanner.nextLine();
        mostrarEquipos();
        System.out.print("Selecciona un equipo por su número: ");
        int indiceEquipo = scanner.nextInt();
        scanner.nextLine();  // Consumir nueva línea

        if (indiceEquipo >= 0 && indiceEquipo < equipos.size()) {
            Equipo equipoSeleccionado = equipos.get(indiceEquipo);
            Jugador nuevoJugador = new Jugador(nombreJugador, equipoSeleccionado);
            jugadores.add(nuevoJugador);
            System.out.println("Jugador creado exitosamente.");
        } else {
            System.out.println("Opción de equipo no válida.");
        }
    }

    private static void eliminarJugador() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores disponibles.");
            return;
        }

        mostrarJugadores();
        System.out.print("Selecciona un jugador por su número para eliminar: ");
        int indiceJugador = scanner.nextInt();
        scanner.nextLine();  // Consumir nueva línea

        if (indiceJugador >= 0 && indiceJugador < jugadores.size()) {
            Jugador jugadorEliminar = jugadores.get(indiceJugador);
            jugadorEliminar.getEquipo().eliminarJugador(jugadorEliminar);
            jugadores.remove(jugadorEliminar);
            System.out.println("Jugador eliminado exitosamente.");
        } else {
            System.out.println("Opción de jugador no válida.");
        }
    }

    private static void eliminarEquipo() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos disponibles.");
            return;
        }

        mostrarEquipos();
        System.out.print("Selecciona un equipo por su número para eliminar: ");
        int indiceEquipo = scanner.nextInt();
        scanner.nextLine();  // Consumir nueva línea

        if (indiceEquipo >= 0 && indiceEquipo < equipos.size()) {
            Equipo equipoEliminar = equipos.get(indiceEquipo);
            jugadores.removeIf(jugador -> jugador.getEquipo() == equipoEliminar);
            equipos.remove(equipoEliminar);
            System.out.println("Equipo y sus jugadores eliminados exitosamente.");
        } else {
            System.out.println("Opción de equipo no válida.");
        }
    }

    private static void mostrarJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores disponibles.");
            return;
        }

        System.out.println("\n--- Lista de Jugadores ---");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(i + ". " + jugadores.get(i));
        }
    }

    private static void mostrarEquipos() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos disponibles.");
            return;
        }

        System.out.println("\n--- Lista de Equipos ---");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(i + ". " + equipos.get(i));
        }
    }
}