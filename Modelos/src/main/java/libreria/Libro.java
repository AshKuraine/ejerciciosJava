package main.java.libreria;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    // Métodos getter y setter para titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Métodos getter y setter para autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método para establecer el número de páginas
    public void setPaginas(int numero) {
        this.paginas = numero * 7;
    }

    // Método para imprimir los detalles del libro
    public void imprimirDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }
}
