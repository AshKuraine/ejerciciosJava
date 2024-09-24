package main.java.plano;

public class Punto {
    private double x;
    private double y;

    // Constructor sin parámetros
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor con parámetros
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters y Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método de instancia para calcular la distancia desde el origen (0,0)
    public double distanciaDesdeOrigen() {
        return Math.sqrt(x * x + y * y);
    }

    // Método estático para calcular la distancia entre dos puntos
    public static double calcularDistancia(Punto p1, Punto p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método estático para determinar si tres puntos están alineados
    public static boolean estanAlineados(Punto p1, Punto p2, Punto p3) {
        // La pendiente entre p1 y p2 debería ser la misma que entre p2 y p3
        return (p2.getY() - p1.getY()) * (p3.getX() - p2.getX()) == (p3.getY() - p2.getY()) * (p2.getX() - p1.getX());
    }
}