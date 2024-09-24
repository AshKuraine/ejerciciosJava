import java.util.Scanner;
public class NumPrimo {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números primos que desea mostrar: ");
        int entero = entrada.nextInt();
        int i = 1;
        int primo = 1;
        do {
            if (esPrimo(primo)) {
                System.out.print(primo + " ");
                i++;
            }
            primo++;
        } while (i <= entero);
    }

    public static boolean esPrimo(int primo) {
        if (primo <= 1) {
            return false;
        }
        if (primo <= 3) {
            return true;
        }
        if (primo % 2 == 0 || primo % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= primo; i += 6) {
            if (primo % i == 0 || primo % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
