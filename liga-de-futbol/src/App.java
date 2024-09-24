import modelos.Equipo;
import modelos.Jugador;
import modelos.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static List<Jugador> jugadores = new ArrayList<>();
    private static List<Equipo> equipos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Crear jugador");
            System.out.println("2. Crear equipo");
            System.out.println("3. Asignar jugador a equipo");
            System.out.println("4. Mostrar lista de jugadores");
            System.out.println("5. Mostrar lista de equipos");
            System.out.println("6. Eliminar jugador");
            System.out.println("7. Eliminar equipo");
            System.out.println("8. Seleccionar jugador");
            System.out.println("9. Seleccionar equipo");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    crearJugador(scanner);
                    break;
                case 2:
                    crearEquipo(scanner);
                    break;
                case 3:
                    asignarJugadorAEquipo(scanner);
                    break;
                case 4:
                    mostrarListaJugadores();
                    break;
                case 5:
                    mostrarListaEquipos();
                    break;
                case 6:
                    eliminarJugador(scanner);
                    break;
                case 7:
                    eliminarEquipo(scanner);
                    break;
                case 8:
                    seleccionarJugador(scanner);
                    break;
                case 9:
                    seleccionarEquipo(scanner);
                    break;
                case 10:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }

    private static void crearJugador(Scanner scanner) {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del jugador: ");
        int edad = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        boolean existe = jugadores.stream().anyMatch(j -> j.getNombre().equals(nombre));
        if (existe) {
            System.out.println("Ya existe un jugador con ese nombre.");
            return;
        }

        Jugador nuevoJugador = new Jugador(nombre, edad);
        jugadores.add(nuevoJugador);
        System.out.println("Jugador creado con éxito.");
    }

    private static void crearEquipo(Scanner scanner) {
        System.out.print("Ingrese el nombre del equipo: ");
        String nombre = scanner.nextLine();

        boolean existe = equipos.stream().anyMatch(e -> e.getNombre().equals(nombre));
        if (existe) {
            System.out.println("Ya existe un equipo con ese nombre.");
            return;
        }

        Equipo nuevoEquipo = new Equipo(nombre);
        equipos.add(nuevoEquipo);
        System.out.println("Equipo creado con éxito.");
    }

    private static void asignarJugadorAEquipo(Scanner scanner) {
        if (equipos.isEmpty() || jugadores.isEmpty()) {
            System.out.println("No hay jugadores o equipos disponibles.");
            return;
        }

        System.out.println("Seleccione un jugador:");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println((i + 1) + ". " + jugadores.get(i).getNombre());
        }
        int jugadorIndex = scanner.nextInt() - 1;

        if (jugadorIndex < 0 || jugadorIndex >= jugadores.size()) {
            System.out.println("Selección no válida.");
            return;
        }

        System.out.println("Seleccione un equipo:");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
        }
        int equipoIndex = scanner.nextInt() - 1;

        if (equipoIndex < 0 || equipoIndex >= equipos.size()) {
            System.out.println("Selección no válida.");
            return;
        }

        Jugador jugadorSeleccionado = jugadores.get(jugadorIndex);
        Equipo equipoSeleccionado = equipos.get(equipoIndex);
        equipoSeleccionado.agregarPersona(jugadorSeleccionado);

        System.out.println("Jugador asignado al equipo con éxito.");
    }

    private static void mostrarListaJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
        } else {
            System.out.println("Lista de jugadores:");
            for (Jugador jugador : jugadores) {
                System.out.println(jugador);
            }
        }
    }

    private static void mostrarListaEquipos() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos registrados.");
        } else {
            System.out.println("Lista de equipos:");
            for (Equipo equipo : equipos) {
                System.out.println(equipo);
            }
        }
    }

    private static void eliminarJugador(Scanner scanner) {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores para eliminar.");
            return;
        }

        System.out.println("Seleccione un jugador para eliminar:");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println((i + 1) + ". " + jugadores.get(i).getNombre());
        }
        int jugadorIndex = scanner.nextInt() - 1;

        if (jugadorIndex < 0 || jugadorIndex >= jugadores.size()) {
            System.out.println("Selección no válida.");
            return;
        }

        jugadores.remove(jugadorIndex);
        System.out.println("Jugador eliminado con éxito.");
    }

    private static void eliminarEquipo(Scanner scanner) {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos para eliminar.");
            return;
        }

        System.out.println("Seleccione un equipo para eliminar:");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
        }
        int equipoIndex = scanner.nextInt() - 1;

        if (equipoIndex < 0 || equipoIndex >= equipos.size()) {
            System.out.println("Selección no válida.");
            return;
        }

        // Eliminar jugadores del equipo
        Equipo equipoEliminar = equipos.get(equipoIndex);
        for (Persona persona : equipoEliminar.getPersonas()) {
            persona.setEquipo(null);  // Desasignar equipo de la persona
        }

        equipos.remove(equipoIndex);
        System.out.println("Equipo eliminado con éxito.");
    }

    private static void seleccionarJugador(Scanner scanner) {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores disponibles.");
            return;
        }

        System.out.println("Seleccione un jugador:");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println((i + 1) + ". " + jugadores.get(i).getNombre());
        }
        int jugadorIndex = scanner.nextInt() - 1;

        if (jugadorIndex < 0 || jugadorIndex >= jugadores.size()) {
            System.out.println("Selección no válida.");
            return;
        }

        Jugador jugadorSeleccionado = jugadores.get(jugadorIndex);
        boolean regresar = false;

        while (!regresar) {
            System.out.println("\nSubmenú de jugador: " + jugadorSeleccionado.getNombre());
            System.out.println("1. Ver detalles");
            System.out.println("2. Cambiar nombre");
            System.out.println("3. Cambiar equipo");
            System.out.println("4. Regresar al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.println(jugadorSeleccionado);
                    break;
                case 2:
                    System.out.print("Ingrese el nuevo nombre del jugador: ");
                    String nuevoNombre = scanner.nextLine();
                    jugadorSeleccionado.setNombre(nuevoNombre);
                    System.out.println("Nombre del jugador actualizado.");
                    break;
                case 3:
                    if (equipos.isEmpty()) {
                        System.out.println("No hay equipos disponibles.");
                    } else {
                        System.out.println("Seleccione un nuevo equipo:");
                        for (int i = 0; i < equipos.size(); i++) {
                            System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
                        }
                        int nuevoEquipoIndex = scanner.nextInt() - 1;

                        if (nuevoEquipoIndex < 0 || nuevoEquipoIndex >= equipos.size()) {
                            System.out.println("Selección no válida.");
                        } else {
                            // Remover jugador del equipo actual si tiene uno
                            if (jugadorSeleccionado.getEquipo() != null) {
                                jugadorSeleccionado.getEquipo().getPersonas().remove(jugadorSeleccionado);
                            }
                            Equipo nuevoEquipo = equipos.get(nuevoEquipoIndex);
                            nuevoEquipo.agregarPersona(jugadorSeleccionado);
                            System.out.println("Equipo del jugador actualizado.");
                        }
                    }
                    break;
                case 4:
                    regresar = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void seleccionarEquipo(Scanner scanner) {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos disponibles.");
            return;
        }

        System.out.println("Seleccione un equipo:");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
        }
        int equipoIndex = scanner.nextInt() - 1;

        if (equipoIndex < 0 || equipoIndex >= equipos.size()) {
            System.out.println("Selección no válida.");
            return;
        }

        Equipo equipoSeleccionado = equipos.get(equipoIndex);
        boolean regresar = false;

        while (!regresar) {
            System.out.println("\nSubmenú de equipo: " + equipoSeleccionado.getNombre());
            System.out.println("1. Ver detalles");
            System.out.println("2. Cambiar nombre");
            System.out.println("3. Agregar jugador al equipo");
            System.out.println("4. Mostrar miembros del equipo");
            System.out.println("5. Gritar Gol");
            System.out.println("6. Regresar al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.println(equipoSeleccionado);
                    break;
                case 2:
                    System.out.print("Ingrese el nuevo nombre del equipo: ");
                    String nuevoNombre = scanner.nextLine();
                    equipoSeleccionado.setNombre(nuevoNombre);
                    System.out.println("Nombre del equipo actualizado.");
                    break;
                case 3:
                    if (jugadores.isEmpty()) {
                        System.out.println("No hay jugadores disponibles.");
                    } else {
                        System.out.println("Seleccione una persona para agregar al equipo:");
                        for (int i = 0; i < jugadores.size(); i++) {
                            System.out.println((i + 1) + ". " + jugadores.get(i).getNombre());
                        }
                        int personaIndex = scanner.nextInt() - 1;

                        if (personaIndex < 0 || personaIndex >= jugadores.size()) {
                            System.out.println("Selección no válida.");
                        } else {
                            Persona personaSeleccionada = jugadores.get(personaIndex);
                            equipoSeleccionado.agregarPersona(personaSeleccionada);
                            System.out.println("Persona agregada al equipo.");
                        }
                    }
                    break;
                case 4:
                    equipoSeleccionado.mostrarPersonas();
                    break;
                case 5:
                    equipoSeleccionado.gritarGolTodos();
                    break;
                case 6:
                    regresar = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
