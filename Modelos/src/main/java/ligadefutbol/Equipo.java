package main.java.ligadefutbol;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }

    public void mostrarJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores en este equipo.");
        } else {
            for (Jugador jugador : jugadores) {
                System.out.println(jugador.getNombre());
            }
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
}
