import java.lang.classfile.TypeAnnotation.SupertypeTarget;
import java.util.Scanner;
public class Strings {
    public static void main (String[] args) {
        /*String palabra = "hola";
        System.out.println("longitud: " + palabra.length());
        System.out.println(palabra.substring(1, 3));*/
        /*Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String palabra = entrada.nextLine();
        System.out.println("longitud: " + palabra.length());*/
        /*Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();
        String completo = nombre.concat(" " + apellido);
        System.out.println("Nombre completo: " + completo);*/
        /*Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();
        System.out.print("Ingrese el primer índice: ");
        int pIndice = entrada.nextInt();
        System.out.print("Ingrese el segundo índice: ");
        int sIndice = entrada.nextInt();
        System.out.println("Subcadena entre los índices: " + frase.substring(pIndice, sIndice));*/
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = entrada.nextLine();
        System.out.print("Ingrese un caracter: ");
        char caracter = entrada.next(".").charAt(0);
        int ubicacion = palabra.indexOf(caracter);
        if (ubicacion < 0) {
            System.out.println("El caracter ingresado no se encuentra en la palabra");
        } else {
            System.out.println("El caracter ingresado se encuentra en la posicion " + ubicacion);
        }
    }
}
