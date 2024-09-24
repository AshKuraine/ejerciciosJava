package modelos;

public class EdificioDeOficinas extends Edificio {
    private Integer numeroDeOficinas;
    private Double cantidadPersonasPorOficina;
    private Integer numeroDePisos;

    public EdificioDeOficinas(Double ancho, Double alto, Double largo, Integer numeroDeOficinas, Double cantidadPersonasPorOficina, Integer numeroDePisos) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantidadPersonasPorOficina = cantidadPersonasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public Double calcularSuperficie() {
        return ancho * largo * numeroDePisos;
    }

    @Override
    public Double calcularVolumen() {
        return ancho * alto * largo;
    }

    public Integer cantPersonas() {
        return numeroDeOficinas * cantidadPersonasPorOficina.intValue();
    }
}