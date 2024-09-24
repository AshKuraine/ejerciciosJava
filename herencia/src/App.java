import java.util.ArrayList;

import modelos.Animal;
import modelos.Gato;
import modelos.Perro;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> animales = new ArrayList<>();

        // Añadiendo varios perros y gatos a la lista
        animales.add(new Perro("Rex", 5, "Labrador"));
        animales.add(new Perro("Max", 3, "Bulldog"));
        animales.add(new Gato("Mimi", 2, "Blanco"));
        animales.add(new Gato("Felix", 4, "Negro"));

        // Recorriendo la lista de animales e identificando su tipo
        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                System.out.println("Es un perro llamado " + animal.getNombre());
            } else if (animal instanceof Gato) {
                System.out.println("Es un gato llamado " + animal.getNombre());
            }

            // Ejecutando el método común que varía según el tipo de animal
            animal.emitirSonido();
            animal.comer();
            animal.dormir();
            System.out.println();
        }
    }
}