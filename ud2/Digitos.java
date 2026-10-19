package ud2;

import java.util.Scanner;

public class Digitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int numeroIntroducido = sc.nextInt();
        sc.close();


        int original = numeroIntroducido;
        String resultado = "";
        
    
        while ( numeroIntroducido > 0) {
            int cifra = numeroIntroducido % 10;

            resultado = cifra + (resultado.isEmpty() ? "" : "," + resultado);

            numeroIntroducido = numeroIntroducido / 10;
        }

        System.out.println("Los dígitos de " + original + " son: " + resultado);


    }


    
}
