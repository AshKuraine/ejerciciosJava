import java.util.Scanner;
public class Factorial {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número del cual se desea obtener el factorial: ");
        int entero = entrada.nextInt();
        int factorial = 1;
        int i = 1;
        do {
            factorial = factorial * i;
            i++;
        } while (i <= entero);
        System.out.println("El factorial de " + entero + " es " + factorial);
    }
}