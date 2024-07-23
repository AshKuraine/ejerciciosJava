import java.util.Scanner;

public class MiPrimerPrograma {
    public static void main (String[] args) {
        /*System.out.println("Hola mundo!");
        System.out.println("Bienvenido a tu curso de Java");
        System.out.println("Mi nombre es AshKuraine");
        Scanner papu = new Scanner(System.in);
        String name = "AshKuraine";
        boolean day = false;
        char vocal = 'a';
        long stars = 1665482828;
        float money = 4875.4f;
        System.out.println("batman: "+name+edad+day+vocal+stars+money);
        System.out.print("Ingrese una edad: ");
        edad = papu.nextInt();
        System.out.println("Mi edad es: "+edad);*/
        int val1 = 7;
        int val2 = 4;

        System.out.println("La suma es "+(val1+val2));
        System.out.println("La diferencia es "+(val1-val2));
        System.out.println("El producto es "+(val1*val2));
        System.out.println("El cociente es "+((float) val1 / val2));
        System.out.println("El modal es "+(val1%val2));

        Scanner value1 = new Scanner(System.in);
        Scanner value2 = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        val1 = value1.nextInt();
        System.out.print("Ingrese otro número: ");
        val2 = value2.nextInt();
        String resultado = val1 > val2 ? "El primer número es mayor que el segundo" : "El primer número no es mayor al segundo";
        System.out.println(resultado);
    }
}
