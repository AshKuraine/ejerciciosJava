import java.util.Scanner;
public class Calculadora {
    public static Scanner pepe = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            int opcion = menu();
            if (opcion == 5) {
                continuar = false;
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int menu() {
        Integer opcion = null;
        System.out.println("Calculadora:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        System.out.println("Por favor ingrese una opción: ");
        do {
            try {
                opcion = pepe.nextInt();
            } catch (Exception e) {
                pepe.nextLine();
                System.out.println("No ingresó una opción válida, intente nuevamente:");
            }
        } while (opcion > 5);
        return opcion;
    }
}
