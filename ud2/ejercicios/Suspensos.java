package ud2;

import java.util.Scanner;

public class Suspensos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca calificaciones (-1 para terminar) \n");
        int notas = sc.nextInt();

        int contadorSuspensos = 0;

        while (notas != -1) {
            if (notas < 5) {
                contadorSuspensos++;
            }

            System.out.println("Introduzca de nuevo otra calificación (-1 para terminar) \n");
            notas = sc.nextInt();
        }

        sc.close();
        if (contadorSuspensos > 0) {
            System.out.println("Hay " + contadorSuspensos + " suspensos.");
        } else {
            System.out.println("No hay suspensos.");
        }
    }
}
