package modelos;

public class Entrenador extends Persona {

    public Entrenador(String nombre, int edad) {
        super(nombre, edad);  // Llama al constructor de la clase padre (Persona)
    }

    @Override
    public void gritarGol() {
        System.out.println(nombre + " grita: ¡Gol del equipo bajo mi mando!");
    }
}
