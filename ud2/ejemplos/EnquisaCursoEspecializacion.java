package ud2.ejemplos;

import java.util.Scanner;

public class EnquisaCursoEspecializacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mostrar menú
        System.out.println("\nESTÁS INTERESAD@ EN HACER UN CURSO DE ESPECIALIZACIÓN?");
        System.out.println("======================================================\n");
        System.out.println("1. Ciberseguridade en contornos das tecnoloxías da información");
        System.out.println("2. Desenvolvemento de videoxogos e realidade virtual");
        System.out.println("3. Intelixencia artificial e big data");
        System.out.println("4. Ningún curso");
        System.out.println("0. Saír");

        System.out.println("\nEscribe una opción");
        int opcion = sc.nextInt();

        while (opcion != 0) {
            // Incrementar el contador correspondiente
            System.out.println("Gracias. Hemos registrado tu respuesta.");

            // Mostrar menú
            System.out.println("\nESTÁS INTERESAD@ EN HACER UN CURSO DE ESPECIALIZACIÓN?");
            System.out.println("======================================================\n");
            System.out.println("1. Ciberseguridade en contornos das tecnoloxías da información");
            System.out.println("2. Desenvolvemento de videoxogos e realidade virtual");
            System.out.println("3. Intelixencia artificial e big data");
            System.out.println("4. Ningún curso");
            System.out.println("0. Saír");

            System.out.println("\nEscribe una opción");
            opcion = sc.nextInt();

        }

        sc.close();

        // Mostrar resultados de la encuesta
        // ...

    }
}
