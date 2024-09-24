import java.util.Scanner;
public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una contraseña
        System.out.print("Ingresa una contraseña: ");
        String contrasena = scanner.nextLine();

        // Verificar si la contraseña es segura
        if (esContrasenaSegura(contrasena)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura. Asegúrate de que cumpla con todos los criterios.");
        }

        scanner.close();
    }

    // Método para verificar si la contraseña es segura
    public static boolean esContrasenaSegura(String contrasena) {
        if (contrasena.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if ("!@#$%^&*()-_=+[]{}|;:'\",.<>?/".indexOf(c) >= 0) {
                tieneCaracterEspecial = true;
            }

            // Si cumple todos los criterios, no es necesario seguir verificando
            if (tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial) {
                return true;
            }
        }

        // Retornar true solo si cumple con todos los criterios
        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial;
    }
}

