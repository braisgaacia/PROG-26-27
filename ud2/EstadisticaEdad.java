package ud2;

import java.util.Scanner;

public class EstadisticaEdad {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las edades de los alumnos (número negativo para finalizar):");

        int edad = sc.nextInt();
        int nAlumnos = 0;
        int sumaEdades = 0;
        int sumaMayores = 0;
        double media = 0;

        while (edad > 0) {

            sumaEdades = sumaEdades + edad;
            nAlumnos = nAlumnos + 1;

            media = sumaEdades / nAlumnos;

            if (edad >=18) {
                sumaMayores = sumaMayores + 1;
            }

            edad = sc.nextInt();
        }
        sc.close();

        System.out.println("Suma de todas las edades: " + sumaEdades);
        System.out.println("Media de las edades: " + media );
        System.out.println("Número de alumnos: " + nAlumnos);
        System.out.println("Número de mayores de edad: " + sumaMayores);

    }

}
