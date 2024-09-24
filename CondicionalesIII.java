import java.util.InputMismatchException;
import java.util.Scanner;
public class CondicionalesIII {
    public static void main (String[] args) {
        /*try {
            Scanner numMM0 = new Scanner(System.in);
            System.out.print("Ingrese el dividendo: ");
            int primer = numMM0.nextInt();
            System.out.print("Ingrese el divisor: ");
            int segundo = numMM0.nextInt();
            double resultado = primer/segundo;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por teclado.");
        }*/
        /*try {
            Scanner numMM0 = new Scanner(System.in);
            System.out.print("Ingrese el primer número: ");
            int primer = numMM0.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int segundo = numMM0.nextInt();
            int resultado = primer-segundo;
            System.out.println("La diferencia es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por teclado.");
        }*/
        try {
            Scanner numMM0 = new Scanner(System.in);
            System.out.print("Ingrese una cadena de números: ");
            String cadena = numMM0.nextLine();
            int resultado = Integer.parseInt(cadena);
            System.out.println("El número es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por teclado.");
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no puede convertirse a un número.");
        }
    }
}
