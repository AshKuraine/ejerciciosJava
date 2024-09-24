package main.java.com;

public class Auto {
    String marca;
    String modelo;
    Integer anno;

    public Auto () {
    }

    public Auto (String marca) {
        this.marca = marca;
    }

    public Auto (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto (String marca, String modelo, Integer anno) {
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
    }

    public void imprimirDatos() {
        if (marca == null) {
            System.out.println("No se inicializaron datos");
        } else if (modelo == null) {
            System.out.println("Marca: " + marca);
        } else if (anno == null) {
            System.out.println("Marca: " + marca + ", modelo: " + modelo);
        } else {
            System.out.println("Marca: " + marca + ", modelo: " + modelo + ", año: " + anno);
        }
    }
}
