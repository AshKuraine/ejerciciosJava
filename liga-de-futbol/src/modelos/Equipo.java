package modelos;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Persona> personas;  // Cambiamos la lista a personas

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.personas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void agregarPersona(Persona persona) {
        if (!personas.contains(persona)) {
            personas.add(persona);
            persona.setEquipo(this);  // Asignar equipo a la persona
        }
    }

    public void mostrarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("El equipo no tiene miembros.");
        } else {
            System.out.println("Personas del equipo " + nombre + ":");
            for (Persona persona : personas) {
                System.out.println(persona.getNombre() + " - " + persona.getClass().getSimpleName());
            }
        }
    }

    public void gritarGolTodos() {
        for (Persona persona : personas) {
            persona.gritarGol();  // Llama al método gritarGol de cada persona
        }
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre + ", Miembros: " + personas.size();
    }
}
