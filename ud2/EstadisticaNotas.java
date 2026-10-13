package ud2;

import java.util.Scanner;

public class EstadisticaNotas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una nota: (-1 para terminar) \n");
        int notas = sc.nextInt();

        int contadorAprobados = 0;
        int contadorCondicionados = 0;
        int contadorSuspensos = 0;


        while (notas != -1) {
            if (notas >= 5) {
                contadorAprobados++;
            } else if (notas == 4) {
                contadorCondicionados++;
            } else if (notas < 4) {
                contadorSuspensos++;
            }

            System.out.println("Vuelve a introducir una nota: (-1 para terminar) \n");
            notas = sc.nextInt();
        }

        sc.close();
        System.out.println("Total de Aprobados: " +contadorAprobados);
        System.out.println("Total de Condicionados: " +contadorCondicionados);
        System.out.println("Total de Suspensos: " +contadorSuspensos);
    }
}
