package ud2;

import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {

    public static void main(String[] args) {
        
        final int NUMERO_MIN = 1;
        final int NUMERO_MAX = 100;

        Random rnd = new Random();
        int random = rnd.nextInt(NUMERO_MIN , NUMERO_MAX + 1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce números para acertar (-1 para rendirse): ");

        int numero = sc.nextInt();

        while ( (numero != -1) && (numero != random ) ) {
            
            if (numero > random) {
                System.out.println("Número incorrecto. EL NÚMERO ES MENOR.");
            } else {
                System.out.println("Número incorrecto. EL NÚMERO ES MAYOR.");
            }
            
            System.out.println("Vuelve a introducir el número: ");
            numero = sc.nextInt();
        }

        sc.close();
        if (numero == random) {
            System.out.println("HAS ACERTADO !!!");
        } else {
            System.out.println("Te has rendido.");
        }

    }

}
