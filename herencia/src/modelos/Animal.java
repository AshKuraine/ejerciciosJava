package modelos;

public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método general que será sobrescrito
    public void emitirSonido() {
        System.out.println("El animal está haciendo un sonido.");
    }

    public void comer() {
        System.out.println("El animal está comiendo.");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}