package biblioteca;

public abstract class ItemBiblioteca {
    private boolean prestado;

    public ItemBiblioteca() {
        this.prestado = false;  // Inicialmente, los elementos no están prestados
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public abstract void prestar();
    public abstract void devolver();
    public abstract double calcularMultas();  // Para el cálculo de multas, con lógica personalizada
}