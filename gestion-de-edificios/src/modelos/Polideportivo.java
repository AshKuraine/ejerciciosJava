package modelos;

public class Polideportivo extends Edificio {
    private String nombre;
    private String tipoInstalacion;  // "Techado" o "Abierto"

    public Polideportivo(Double ancho, Double alto, Double largo, String nombre, String tipoInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public Double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public Double calcularVolumen() {
        return ancho * alto * largo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }
    
}
