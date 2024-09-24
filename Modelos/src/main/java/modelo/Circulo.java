package main.java.modelo;

public class Circulo {
    // Atributos privados
    private double radio;

    // Constructor sin parámetros
    public Circulo() {
        this.radio = 0;
    }

    // Constructor con parámetros
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double area() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    // Método para imprimir los datos del círculo
    public void imprimirDatos() {
        System.out.println("Círculo:");
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }
}