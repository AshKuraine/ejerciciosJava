import java.util.Scanner;
public class Nota {
    public static Scanner pepe = new Scanner(System.in);
    public static void main(String[] args) {
        int nota = ingreseNota();
        String notaFinal = calcularNota(nota);
        System.out.print("La nota final es " + notaFinal);
    }

    public static int ingreseNota() {
        Integer nota = null;
        System.out.println("Por favor ingrese una nota: ");
        do {
            try {
                nota = pepe.nextInt();
            } catch (Exception e) {
                pepe.nextLine();
                System.out.println("No ingresó una nota válida, intente nuevamente:");
            }
        } while (nota < 0 && nota > 100);
        return nota;
    }

    public static String calcularNota(int nota) {
        String calificacion = switch (nota/10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
        return calificacion;
    }
}
