package ud2;

import java.util.Scanner;

public class Capicua {

    public static boolean esCapicua(long n) {

        long original = n; //Variable original
        long invertido = 0;

        //Bucle para darle la vuelta al número

        while (n > 0) { //Hasta que sea de menos de una cifra no para
            long ultimaCifra = n % 10; //Para mirar la última cifra
            invertido = (invertido * 10 ) + ultimaCifra; // 0 * 10 = 0 + 7 = 7 --> Después --> 7 * 10 = 70 + 8(ultima cifra) = 78
            n = n / 10; // Le quitamos un numero para seguir calculando el siguiente
        }

        return original == invertido;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número comprendido entre 0 y 9999");
        long numeroIntroducido = sc.nextLong();
        sc.close();


        System.out.println("El número es capicúa ? " + esCapicua(numeroIntroducido));

        
    }

}
