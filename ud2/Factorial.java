package ud2;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para calcular su factorial : \n");
        int factorial = sc.nextInt();
        sc.close();

        int multiplicaciones = 1; // 1 para que no de 0 todo el rato

        for ( int i = factorial ; i > 0 ; i--){
            multiplicaciones = multiplicaciones * i;

        }

        System.out.println("Factorial : " + multiplicaciones);
        
    }
}
