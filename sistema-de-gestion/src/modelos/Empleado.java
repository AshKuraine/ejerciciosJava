package modelos;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private Integer edad;
    private Double salario;
    private String departamento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Empleado(String nombre, Integer edad, Double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    public static void mostrarTodosLosEmpleados(Empleado[] empleados) {
        System.out.printf("%-10s %-20s %-10s %-10s %-20s%n", "Fila", "Nombre", "Edad", "Salario", "Departamento");
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < empleados.length; i++) {
            System.out.printf("%-10d %-20s %-10d %-10.2f %-20s%n", i + 1, empleados[i].getNombre(), empleados[i].getEdad(),
                    empleados[i].getSalario(), empleados[i].getDepartamento());
        }
    }

    // Método para filtrar empleados
    public static List<Empleado> filtrarEmpleados(Empleado[] empleados, String atributo, Object valorMin, Object valorMax) {
        List<Empleado> empleadosFiltrados = new ArrayList<>();

        for (Empleado empleado : empleados) {
            switch (atributo.toLowerCase()) {
                case "nombre":
                    if (empleado.getNombre().equals(valorMin)) {
                        empleadosFiltrados.add(empleado);
                    }
                    break;
                case "edad":
                    if (empleado.getEdad() >= (Integer) valorMin && empleado.getEdad() <= (Integer) valorMax) {
                        empleadosFiltrados.add(empleado);
                    }
                    break;
                case "salario":
                    if (empleado.getSalario() >= (Double) valorMin && empleado.getSalario() <= (Double) valorMax) {
                        empleadosFiltrados.add(empleado);
                    }
                    break;
                case "departamento":
                    if (empleado.getDepartamento().equals(valorMin)) {
                        empleadosFiltrados.add(empleado);
                    }
                    break;
                default:
                    System.out.println("Atributo desconocido para filtrar.");
                    break;
            }
        }
        return empleadosFiltrados;
    }

    // Método para ordenar empleados usando el algoritmo de burbuja
    public static void ordenarEmpleados(Empleado[] empleados, String atributo) {
        boolean swapped;
        int n = empleados.length;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                boolean condicion = false;

                switch (atributo.toLowerCase()) {
                    case "nombre":
                        condicion = empleados[j].getNombre().compareTo(empleados[j + 1].getNombre()) > 0;
                        break;
                    case "edad":
                        condicion = empleados[j].getEdad() > empleados[j + 1].getEdad();
                        break;
                    case "salario":
                        condicion = empleados[j].getSalario() > empleados[j + 1].getSalario();
                        break;
                    case "departamento":
                        condicion = empleados[j].getDepartamento().compareTo(empleados[j + 1].getDepartamento()) > 0;
                        break;
                    default:
                        System.out.println("Atributo desconocido para ordenar.");
                        return;
                }

                if (condicion) {
                    // Intercambiar empleados[j] y empleados[j+1]
                    Empleado temp = empleados[j];
                    empleados[j] = empleados[j + 1];
                    empleados[j + 1] = temp;
                    swapped = true;
                }
            }

            // Si no hubo intercambio, la lista ya está ordenada
            if (!swapped) break;
        }
    }

    // Método para buscar un empleado por nombre
    public static Empleado buscarPorNombre(Empleado[] empleados, String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                return empleado;
            }
        }
        return null; // Si no se encuentra ningún empleado con ese nombre
    }

    // Método para incrementar el salario de un empleado
    public static Empleado incrementarSalario(Empleado empleado, double porcentaje) {
        double nuevoSalario = empleado.getSalario() + (empleado.getSalario() * porcentaje / 100);
        empleado.setSalario(nuevoSalario);
        return empleado;
    }

}
