package main.java.ligadefutbol;

public class Jugador {
    private String nombre;
    private Equipo equipo;

    public Jugador(String nombre, Equipo equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
        equipo.agregarJugador(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        if (this.equipo != null) {
            this.equipo.eliminarJugador(this);
        }
        this.equipo = equipo;
        equipo.agregarJugador(this);
    }

    @Override
    public String toString() {
        return nombre + " (Equipo: " + equipo.getNombre() + ")";
    }
}