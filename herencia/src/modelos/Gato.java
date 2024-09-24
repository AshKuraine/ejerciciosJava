package modelos;

public class Gato extends Animal {
    private String color;

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    @Override
    public void emitirSonido() {
        System.out.println("El gato está maullando.");
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo pescado.");
    }

    @Override
    public void dormir() {
        System.out.println("El gato está durmiendo encima del sofá.");
    }
}