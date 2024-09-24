package main.java.com;

public class Persona {
    String nombre;
    Integer edad;

    public Persona () {
    }

    public Persona (String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

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
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public void imprimirNombreYEdad() {
        System.out.println("Nombre: " + nombre + ", edad: " + edad);
    }
}
