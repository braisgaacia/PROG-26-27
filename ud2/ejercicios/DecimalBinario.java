package ud2;

import java.util.Scanner;

public class DecimalBinario {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número decimal: ");
        int numeroDecimalInicial = sc.nextInt();

        String numeroBinario = "";


        for (int numDivisiones = 0 ; numeroDecimalInicial > 0 ; numDivisiones++ ){
            int resto;
            
             resto = numeroDecimalInicial % 2;
             
             numeroBinario = resto + numeroBinario;

             numeroDecimalInicial = numeroDecimalInicial / 2; 
        }

        System.out.println(numeroBinario);
    }
}
