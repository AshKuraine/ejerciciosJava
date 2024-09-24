package modelos;

public abstract class Edificio {
    protected Double ancho;
    protected Double alto;
    protected Double largo;

    public Edificio(Double ancho, Double alto, Double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public abstract Double calcularSuperficie();
    public abstract Double calcularVolumen();
}