import java.util.Scanner;
public class MetodosI {

    public static Scanner pepe = new Scanner(System.in);
    public static void main(String[] args) {    
        System.out.print("Por favor ingrese un nombre: ");
        String nombre = pepe.nextLine();
        System.out.print("Por favor ingrese una edad: ");
        int edad = pepe.nextInt();
        imprimirNombreYEdad(nombre, edad);
        imprimirNombre(nombre);
        imprimirEdad(edad);
        int valor = pedirNumero();
        imprimirTablaMultiplicar(valor);
        int[] valores = pedirNumeros2();
        for (int i = 0; i < valores.length; i++) {
            imprimirTablaMultiplicar(valores[i]);
        }
    }

    public static void imprimirNombreYEdad(String nombre, int edad) {
        System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años de edad.");
    }

    public static void imprimirNombre(String nombre) {
        System.out.println("Tu nombre es " + nombre + ".");
    }

    public static void imprimirEdad(int edad) {
        System.out.println("Tienes " + edad + " años de edad.");
    }

    public static int pedirNumero() {
        System.out.print("Por favor ingrese un número: ");
        int numero = pepe.nextInt();
        return numero;
    }

    public static void imprimirTablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero*i);
        }
    }

    public static int[] pedirNumeros2() {
        int[] numeros = new int[3];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Por favor ingrese el " + (i + 1) + "º número: ");
            numeros[i] = pepe.nextInt();
        }
        return numeros;
    }

}