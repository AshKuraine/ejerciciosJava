import java.util.Scanner;
public class DibujarCuadrado {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el lado del largo del cuadrado: ");
        int entero = entrada.nextInt();
        for (int i = 0; i < entero; i++) {
            if (i == 0 || i == entero-1) {
                for (int j = 0; j < entero; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < entero; j++) {
                    if (j == 0 || j == entero-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}