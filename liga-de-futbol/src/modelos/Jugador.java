package modelos;

public class Jugador extends Persona {

    public Jugador(String nombre, int edad) {
        super(nombre, edad);  // Llama al constructor de la clase padre (Persona)
    }

    @Override
    public void gritarGol() {
        System.out.println(nombre + " grita: ¡Golazo del jugador!");
    }
}
