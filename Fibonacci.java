import java.util.Scanner;
public class Fibonacci {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la posición del valor de la serie de Fibonacci: ");
        int entero = entrada.nextInt();
        int num1 = 0, num2 = 1;
        int i = 1;
        do {
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        } while (i < entero);
        System.out.println("El valor de Fibonacci de la posición " + entero + " es " + num2);
    }
}