package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<ItemBiblioteca> catalogo;

    public Biblioteca() {
        catalogo = new ArrayList<>();
    }

    public void agregarItem(ItemBiblioteca item) {
        catalogo.add(item);
    }

    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            System.out.println("Catálogo de Items de la Biblioteca:");
            for (ItemBiblioteca item : catalogo) {
                if (item instanceof Catalogable) {
                    ((Catalogable) item).obtenerInformacion();
                    System.out.println();  // Separador entre items
                }
            }
        }
    }

    public void prestarItem(String titulo) {
        for (ItemBiblioteca item : catalogo) {
            if (item instanceof Libro && ((Libro) item).getTitulo().equalsIgnoreCase(titulo)) {
                item.prestar();
                return;
            } else if (item instanceof Revista && ((Revista) item).getNombreRevista().equalsIgnoreCase(titulo)) {
                item.prestar();
                return;
            } else if (item instanceof Pelicula && ((Pelicula) item).getTitulo().equalsIgnoreCase(titulo)) {
                item.prestar();
                return;
            }
        }
        System.out.println("El item '" + titulo + "' no se encuentra en el catálogo.");
    }

    public void devolverItem(String titulo) {
        for (ItemBiblioteca item : catalogo) {
            if (item instanceof Libro && ((Libro) item).getTitulo().equalsIgnoreCase(titulo)) {
                item.devolver();
                return;
            } else if (item instanceof Revista && ((Revista) item).getNombreRevista().equalsIgnoreCase(titulo)) {
                item.devolver();
                return;
            } else if (item instanceof Pelicula && ((Pelicula) item).getTitulo().equalsIgnoreCase(titulo)) {
                item.devolver();
                return;
            }
        }
        System.out.println("El item '" + titulo + "' no está prestado.");
    }
}
