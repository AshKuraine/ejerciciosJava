package main.java.com;

public class Application {
    public static void main (String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Shizu";
        persona1.edad = 22;
        Persona persona2 = new Persona();
        persona2.nombre = "Mariya";
        persona2.edad = 24;
        persona1.imprimirNombreYEdad();
        persona2.imprimirNombreYEdad();
        System.out.println(persona2.getNombre());
        Auto auto1 = new Auto();
        Auto auto2 = new Auto("Toyota");
        Auto auto3 = new Auto("Toyota", "Van");
        Auto auto4 = new Auto("Toyota", "Van", 2005);
        auto1.imprimirDatos();
        auto2.imprimirDatos();
        auto3.imprimirDatos();
        auto4.imprimirDatos();
    }

    public static void imprimirNombreYEdad(String nombre, Integer edad) {
        System.out.println("Nombre: " + nombre + ", edad: " + edad);
    }

    public static void imprimirNombreYEdad(Persona persona) {
        System.out.println("Nombre: " + persona.nombre + ", edad: " + persona.edad);
    }
}
