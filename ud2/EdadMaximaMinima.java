package ud2;

import java.util.Scanner;

public class EdadMaximaMinima {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce edades para calcular el máximo y el mínimo (-1 para terminar)");

        int edadMax = 0;
        int edadMin = 0;

        int edad = sc.nextInt();
        
        while (edad != -1) {
            
            edadMax = Math.max(edad, edad);
            
            edadMin = Math.min(edad, edad);

            edad = sc.nextInt();
        }

        System.out.println("La edad máxima es: " + edadMax);
        System.out.println("La edad mínima es: " + edadMin);
        
    }

}
