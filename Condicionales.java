import java.util.Scanner;
public class Condicionales {
    public static void main (String[] args) {
        int numVal = 0;
        Scanner numMM0 = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        numVal = numMM0.nextInt();
        if (numVal == 0) {
            System.out.println("El número ingresado es 0");
        } else if (numVal > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
}
