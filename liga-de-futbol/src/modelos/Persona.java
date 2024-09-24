package modelos;

public class Persona {
    protected String nombre;
    protected int edad;
    protected Equipo equipo;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    // Método que se sobrescribirá en las subclases
    public void gritarGol() {
        System.out.println(nombre + " grita: ¡Gol!");
    }

    @Override
    public String toString() {
        String equipoNombre = (equipo != null) ? equipo.getNombre() : "Sin equipo";
        return "Nombre: " + nombre + ", Edad: " + edad + ", Equipo: " + equipoNombre;
    }
}
