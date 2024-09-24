package modelos;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void emitirSonido() {
        System.out.println("El perro está ladrando.");
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo croquetas.");
    }

    @Override
    public void dormir() {
        System.out.println("El perro está durmiendo en su cama.");
    }
}