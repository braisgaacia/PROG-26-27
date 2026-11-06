package ud2;

import java.util.Scanner;

public class EdadMaximaMinima {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce edades para mostrar la máxima y mínima (-1 para terminar):");
        
        int edad = sc.nextInt();
        int edadMax = edad;
        int edadMin = edad;

        while (edad != -1) {
            
            edadMax = Math.max(edadMax, edad);
            edadMin = Math.min(edadMin, edad);

            edad = sc.nextInt();
        }

        sc.close();
        System.out.println("La edad máxima es: " + edadMax);
        System.out.println("La edad mínima es: " + edadMin);
    }

}
