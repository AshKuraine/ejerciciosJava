import java.util.Scanner;
public class ClaseMath {
    public static void main (String[] args) {
        System.out.println(Math.random()*5+3);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un entero: ");
        int entero = entrada.nextInt();
        System.out.println("El valor absoluto de " + entero + " es " + Math.abs(entero));
        System.out.print("Ingrese un decimal: ");
        double decimal = entrada.nextDouble();
        System.out.println("El valor redondeado de de " + decimal + " es " + Math.round(decimal));
    }
}