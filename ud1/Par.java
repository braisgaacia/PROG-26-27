

import java.util.Scanner;

public class Par {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int numero = sc.nextInt();
        sc.close();

        System.out.println( numero % 2 == 0);

    }
}
