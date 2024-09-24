package biblioteca;

public class Libro extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro(String titulo, String autor, int numeroDePaginas) {
        super();  // Llama al constructor de la clase abstracta
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public void prestar() {
        if (!isPrestado()) {
            setPrestado(true);
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (isPrestado()) {
            setPrestado(false);
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' no estaba prestado.");
        }
    }

    @Override
    public double calcularMultas() {
        // Aquí puedes agregar la lógica para calcular multas (por ejemplo, por retraso en la devolución)
        return 0.0;  // Este es un valor de ejemplo
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroDePaginas);
        System.out.println("Estado: " + (isPrestado() ? "Prestado" : "Disponible"));
    }
}