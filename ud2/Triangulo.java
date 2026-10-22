package ud2;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        sc.close();

        System.out.println(triangulo(numero));
    }

    public static String triangulo(int num) {

        for (int i = 1; i <= num; i++) {
            //Añade espacios antes de los *
            for (int e = 1 ; e < num - 1 ; e++){
                return (" ");
            }

            for ( int a = 1 ; a <= i ; a++ ){
                return ("* ");
            }
            
        }
        return null;

        
    }
}
