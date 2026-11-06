package ud2;

import java.util.Scanner;

public class Primo {

    public static boolean esPrimo (int n){
        
        int contadorDivisores = 0;

        for (int i = 1 ; n >= i ; i++){ //GENERA DIVISORES
            if (n % i == 0) { // Si da 0 es exacta
                contadorDivisores++;
            }
        }
         if (contadorDivisores == 2) {
                return true;
            }else {
                return false;
            }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIntroduce un número para saber si es primo: ");
        int numeroIntroducido = sc.nextInt();
        sc.close();

        boolean resultado = esPrimo(numeroIntroducido);

        System.out.println("Es primo ? " + resultado);
    }
}
