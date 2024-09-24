package biblioteca;

public class Pelicula extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String director;
    private int duracion;  // Duración en minutos

    public Pelicula(String titulo, String director, int duracion) {
        super();  // Llama al constructor de la clase abstracta
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void prestar() {
        if (!isPrestado()) {
            setPrestado(true);
            System.out.println("La película '" + titulo + "' ha sido prestada.");
        } else {
            System.out.println("La película '" + titulo + "' ya está prestada.");
        }
    }

    @Override
    public void devolver() {
        if (isPrestado()) {
            setPrestado(false);
            System.out.println("La película '" + titulo + "' ha sido devuelta.");
        } else {
            System.out.println("La película '" + titulo + "' no estaba prestada.");
        }
    }

    @Override
    public double calcularMultas() {
        // Lógica para calcular multas si es necesario
        return 0.0;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Estado: " + (isPrestado() ? "Prestado" : "Disponible"));
    }
}
