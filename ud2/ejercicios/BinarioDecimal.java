package ud2;

import java.util.Scanner;

public class BinarioDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número en binario para pasar a decimal: ");
        String binario = sc.nextLine();
        sc.close();

        Double resultadoDecimal = 0.;
        
        for (int posicionCaracter = 0 ; posicionCaracter < binario.length() ; posicionCaracter++){  //.lenght para saber el tamaño de la cadena de texto
           
            char caracter = binario.charAt(posicionCaracter);

            int caracterANumero = Character.getNumericValue(caracter); // Coge el valor número del caracter sin transformar en ASCII

            Double sumando = caracterANumero * Math.pow(2, (binario.length()-posicionCaracter - 1)); // Los exponentes empiezan desde el numero mas alto hasta el mas bajo por lo que es el tamaño de la cadena de texto menos la posicion de el caracter.
            //Y se le resta -1 porque acaba en 0 la potecia. P.EJ. 110 LONGITUD 3 , EXPONENTES 2 1 0.

            resultadoDecimal = resultadoDecimal + sumando;
            
        }

        System.out.println(resultadoDecimal);
    }
}
