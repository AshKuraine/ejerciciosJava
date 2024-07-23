import java.util.Scanner;
public class CondicionalesII {
    public static void main (String[] args) {
        int numVal;
        Scanner valSwitch = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        numVal = valSwitch.nextInt();
        switch (numVal) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Error");
        }
    }
}
