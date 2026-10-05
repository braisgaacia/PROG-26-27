package ud2;

import java.util.Scanner;

public class ContarCifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int a = sc.nextInt();

        sc.close();

        if (a >= 0 && a<= 99999) {
            System.out.println("El numero esta dentro del rango a evaluar");
            if (a >= 0 && a< 10) {
                System.out.println("El numero tiene 1 cifra");
            } else if (a >= 10 && a< 100) {
                System.out.println("El numero tiene 2 cifras");
            }  else if (a >= 100 && a< 1000) {
                System.out.println("El numero tiene 3 cifras");
            } else if (a >= 1000 && a< 10000) {
                System.out.println("El numero tiene 4 cifras");
            } else if (a >= 10000 && a< 100000) {
                System.out.println("El numero tiene 5 cifras");
            }
        } else {
            System.out.println("El número esta fuera del rango a evaluar");

        }
    }
}