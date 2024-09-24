import java.util.ArrayList;
import java.util.List;

import modelos.Edificio;
import modelos.Polideportivo;
import modelos.EdificioDeOficinas;

public class App {
    public static void main(String[] args) throws Exception {
        List<Edificio> edificios = new ArrayList<>();

        // Crear instancias de Polideportivo
        Polideportivo polideportivo1 = new Polideportivo(50.0, 10.0, 30.0, "Polideportivo Central", "Techado");
        Polideportivo polideportivo2 = new Polideportivo(60.0, 12.0, 40.0, "Polideportivo Norte", "Abierto");

        // Crear instancias de EdificioDeOficinas
        EdificioDeOficinas oficina1 = new EdificioDeOficinas(40.0, 50.0, 20.0, 10, 5.0, 4);
        EdificioDeOficinas oficina2 = new EdificioDeOficinas(30.0, 40.0, 15.0, 8, 6.0, 3);

        // Añadir edificios a la lista
        edificios.add(polideportivo1);
        edificios.add(polideportivo2);
        edificios.add(oficina1);
        edificios.add(oficina2);

        // Recorrer y mostrar resultados
        int techados = 0;
        int abiertos = 0;
        for (Edificio edificio : edificios) {
            System.out.println("Superficie: " + edificio.calcularSuperficie());
            System.out.println("Volumen: " + edificio.calcularVolumen());

            if (edificio instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) edificio;
                if (poli.getTipoInstalacion().equals("Techado")) {
                    techados++;
                } else {
                    abiertos++;
                }
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas oficina = (EdificioDeOficinas) edificio;
                System.out.println("Cantidad de personas en el edificio: " + oficina.cantPersonas());
            }
        }

        System.out.println("\nCantidad de polideportivos techados: " + techados);
        System.out.println("Cantidad de polideportivos abiertos: " + abiertos);
    }
}