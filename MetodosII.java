import java.util.Scanner;
public class MetodosII {
    public static Scanner pepe = new Scanner(System.in);
    public static void main(String[] args) {
        int valor = solicitarNumero();
        if (valor % 2 == 0) {
            System.out.println("El "+valor+" es par");
        }
    }

    public static int solicitarNumero() {
        Integer numero = null;
        System.out.println("Por favor ingrese un número: ");
        do {
            try {
                numero = pepe.nextInt();
            } catch (Exception e) {
                pepe.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == null);
        return numero;
    }
}