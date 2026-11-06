package ud2;

import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de año: ");
        int numAno = sc.nextInt();
        sc.close();

        boolean bisisesto = numAno%4 == 0;

        if (numAno%400 == 0 || numAno % 4 == 0 && numAno % 100 !=0 ) {

            System.out.println("Es un año bisiesto");
            
        } else {
            System.out.println("No es bisiesto");
        }
    }
}
