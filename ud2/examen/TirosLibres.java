package ud2.examen;

import java.util.Scanner;

/** @author Brais García Piñeiro */

public class TirosLibres {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Double contadorLanzamientos = 0.;
        Double contadorAnotados = 0.;
        int contadorFallos = 0;

        System.out.println("Introduce una sucesión de:  (1) para anotar un tiro o (0) si el tiro es fallado:");
        int numeroIntroducido = sc.nextInt();

        do{

            if (contadorLanzamientos != 0) {
                numeroIntroducido = sc.nextInt();
            }
            contadorLanzamientos++;

            if (numeroIntroducido == 1) {
                contadorAnotados++;
                contadorFallos = 0;
            } else {
                contadorFallos++;
            }


        }while(contadorLanzamientos < 20 && contadorFallos < 3);
        sc.close();

        Double porcentajeAcierto = (contadorAnotados / contadorLanzamientos) * 100;

        System.out.println(contadorLanzamientos + " lanzamientos.");
        System.out.println(contadorAnotados + " Anotados.");
        System.out.printf("%.2f porciento. \n", porcentajeAcierto);
        if (porcentajeAcierto > 70.) {
            System.out.println("SI supera el 70%.");
        } else System.out.println("NO supera el 70%.");
        
        

    }
}
    
