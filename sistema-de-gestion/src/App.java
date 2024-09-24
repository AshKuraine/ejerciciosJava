import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelos.Empleado;

public class App {

     private static List<Empleado> empleados = new ArrayList<>();
    // Lista temporal filtrada
    private static List<Empleado> empleadosFiltrados = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // Inicializa la lista de empleados (ejemplo)
        empleados.add(new Empleado("Juan", 30, 1500.0, "IT"));
        empleados.add(new Empleado("Ana", 25, 2000.0, "Marketing"));
        empleados.add(new Empleado("Luis", 40, 2500.0, "Ventas"));
        
        empleadosFiltrados = new ArrayList<>(empleados);
        while (!salir) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Mostrar todos los empleados");
            System.out.println("2. Crear empleado");
            System.out.println("3. Filtrar empleados");
            System.out.println("4. Ordenar empleados");
            System.out.println("5. Incrementar salario");
            System.out.println("6. Limpiar filtros");
            System.out.println("7. Salir del programa");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    mostrarTodosLosEmpleados();
                    break;
                case 2:
                    crearEmpleado(scanner);
                    break;
                case 3:
                    filtrarEmpleados(scanner);
                    break;
                case 4:
                    ordenarEmpleados(scanner);
                    break;
                case 5:
                    incrementarSalario(scanner);
                    break;
                case 6:
                    limpiarFiltros();
                    break;
                case 7:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    // Método para mostrar todos los empleados
    public static void mostrarTodosLosEmpleados() {
        Empleado.mostrarTodosLosEmpleados(empleadosFiltrados.toArray(new Empleado[0]));
    }

    // Método para crear un empleado
    public static void crearEmpleado(Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        
        // Verificar si ya existe un empleado con el mismo nombre
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Error: Ya existe un empleado con ese nombre.");
                return;
            }
        }

        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();  // Consumir la nueva línea
        System.out.print("Ingrese el departamento del empleado: ");
        String departamento = scanner.nextLine();

        Empleado nuevoEmpleado = new Empleado(nombre, edad, salario, departamento);
        empleados.add(nuevoEmpleado);
        empleadosFiltrados.add(nuevoEmpleado);

        System.out.println("Empleado creado exitosamente.");
    }

    // Método para filtrar empleados
    public static void filtrarEmpleados(Scanner scanner) {
        System.out.println("Seleccione el atributo por el cual desea filtrar:");
        System.out.println("1. Nombre");
        System.out.println("2. Edad");
        System.out.println("3. Salario");
        System.out.println("4. Departamento");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre para filtrar: ");
                String nombre = scanner.nextLine();
                empleadosFiltrados = Empleado.filtrarEmpleados(empleados.toArray(new Empleado[0]), "nombre", nombre, null);
                break;
            case 2:
                System.out.print("Ingrese la edad mínima: ");
                int edadMin = scanner.nextInt();
                System.out.print("Ingrese la edad máxima: ");
                int edadMax = scanner.nextInt();
                empleadosFiltrados = Empleado.filtrarEmpleados(empleados.toArray(new Empleado[0]), "edad", edadMin, edadMax);
                break;
            case 3:
                System.out.print("Ingrese el salario mínimo: ");
                double salarioMin = scanner.nextDouble();
                System.out.print("Ingrese el salario máximo: ");
                double salarioMax = scanner.nextDouble();
                empleadosFiltrados = Empleado.filtrarEmpleados(empleados.toArray(new Empleado[0]), "salario", salarioMin, salarioMax);
                break;
            case 4:
                System.out.print("Ingrese el departamento para filtrar: ");
                String departamento = scanner.nextLine();
                empleadosFiltrados = Empleado.filtrarEmpleados(empleados.toArray(new Empleado[0]), "departamento", departamento, null);
                break;
            default:
                System.out.println("Opción no válida.");
        }
        System.out.println("Filtro aplicado.");
    }

    // Método para ordenar empleados
    public static void ordenarEmpleados(Scanner scanner) {
        System.out.println("Seleccione el atributo por el cual desea ordenar:");
        System.out.println("1. Nombre");
        System.out.println("2. Edad");
        System.out.println("3. Salario");
        System.out.println("4. Departamento");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Empleado.ordenarEmpleados(empleadosFiltrados.toArray(new Empleado[0]), "nombre");
                break;
            case 2:
                Empleado.ordenarEmpleados(empleadosFiltrados.toArray(new Empleado[0]), "edad");
                break;
            case 3:
                Empleado.ordenarEmpleados(empleadosFiltrados.toArray(new Empleado[0]), "salario");
                break;
            case 4:
                Empleado.ordenarEmpleados(empleadosFiltrados.toArray(new Empleado[0]), "departamento");
                break;
            default:
                System.out.println("Opción no válida.");
        }
        System.out.println("Empleados ordenados.");
    }

    // Método para incrementar el salario de un empleado
    public static void incrementarSalario(Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        Empleado empleado = Empleado.buscarPorNombre(empleados.toArray(new Empleado[0]), nombre);

        if (empleado == null) {
            System.out.println("Empleado no encontrado.");
            return;
        }

        System.out.print("Ingrese el porcentaje de aumento: ");
        double porcentaje = scanner.nextDouble();

        Empleado.incrementarSalario(empleado, porcentaje);
        System.out.println("Salario incrementado exitosamente.");
    }

    // Método para limpiar filtros y mostrar la lista original de empleados
    public static void limpiarFiltros() {
        empleadosFiltrados = new ArrayList<>(empleados);
        System.out.println("Filtros limpiados. Mostrando todos los empleados.");
    }
}
