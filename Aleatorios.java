import java.util.Scanner;
import java.lang.Math;
public class Aleatorios {
    public static Scanner pepe = new Scanner(System.in);
    public static void main(String[] args) {
        int inferior = leerValor("límite inferior");
        int superior = leerValor("límite superior");
        generar(inferior, superior);
    }
    public static int leerValor(String nomValor) {
        Integer valor = null;
        do {
            try {
                System.out.println("Ingrese el " + nomValor + ": ");
                valor = pepe.nextInt();
            } catch (Exception e) {
                pepe.nextLine();
                System.out.println("No ingresó un valor válido, intente nuevamente:");
            }
        } while (valor == null);
        return valor;
    }

    public static void generar(int inferior, int superior) {
        int aleatorio = (int) Math.floor(Math.random() * (superior - inferior)) + inferior;
        System.out.println("El número aleatorio es " + aleatorio);
    }
}
