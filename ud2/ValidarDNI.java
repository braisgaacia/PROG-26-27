package ud2;

import java.util.Scanner;

public class ValidarDNI {

    public static boolean esCorrecto(int num) {
        if (num < 99999999 && num > 9999999) {
            return true;
        } else
            return false;
    }

    public static char letraDni(int num) {

        int resto = num % 23;
        String cadenaDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        return cadenaDni.charAt(resto);
    
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu número de DNI para averiguar la letra: ");
        int numeroDni = sc.nextInt();

        while (esCorrecto(numeroDni) == false) {

            System.out.println("\nEl número del DNI no es válido.");
            System.out.println("==============================\n");

            System.out.println("Vuelve a introducir el número del DNI:");
            numeroDni = sc.nextInt();

        }

        sc.close();
        System.out.println("La letra del DNI " + numeroDni + " es: " + letraDni(numeroDni));

    }
}
