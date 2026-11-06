package ud2;

import java.util.Scanner;


public class CasiCero {
    public static void main(String[] args) {
        System.out.print("Introduzca un número decimal-> ");
        Scanner sc = new Scanner(System.in);
        double n_decimal = sc.nextDouble();
        
        sc.close();

        if (-1< n_decimal && n_decimal<1 && n_decimal!=0) {
            System.out.println(n_decimal + " es un casi 0.");   
        } else {
            System.out.println(n_decimal + " no es un casi 0.");

        }
            
        
    }

}
