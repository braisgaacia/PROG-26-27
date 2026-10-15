package ud2;

import java.util.Scanner;

public class Maximo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIntroduce DOS números para calcular el máximo:");
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        sc.close();

        double maximo = numMaximo(numero1, numero2);

        System.out.println("El número máximo es: " + maximo);

    }

    public static double numMaximo (double numeroA, double numeroB){
        if (numeroA > numeroB) {
           return numeroA;
        }else {
            return numeroB;
        }
    }
}
