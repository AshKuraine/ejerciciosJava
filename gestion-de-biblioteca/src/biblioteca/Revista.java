package biblioteca;

public class Revista extends ItemBiblioteca implements Catalogable {
    private String nombreRevista;
    private int nroEdicion;
    private int cantidadEjemplares;

    public Revista(String nombreRevista, int nroEdicion, int cantidadEjemplares) {
        super();  // Llama al constructor de la clase abstracta
        this.nombreRevista = nombreRevista;
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    @Override
    public void prestar() {
        if (cantidadEjemplares > 0) {
            cantidadEjemplares--;
            System.out.println("Se ha prestado un ejemplar de la revista '" + nombreRevista + "'.");
        } else {
            System.out.println("No hay ejemplares disponibles de la revista '" + nombreRevista + "'.");
        }
    }

    @Override
    public void devolver() {
        cantidadEjemplares++;
        System.out.println("Se ha devuelto un ejemplar de la revista '" + nombreRevista + "'.");
    }

    @Override
    public double calcularMultas() {
        // Implementa la lógica de multas si es necesario
        return 0.0;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Nombre de la Revista: " + nombreRevista);
        System.out.println("Número de Edición: " + nroEdicion);
        System.out.println("Cantidad de Ejemplares Disponibles: " + cantidadEjemplares);
    }
}