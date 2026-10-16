package ud2;

import java.util.Scanner;

public class EsVocal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un carácter para saber si es vocal:");
        char caracterIntroducido = sc.nextLine().charAt(0);           //sc.next lee lo que se escribe por teclado y .CharAt (0) la posicion 0 (el primer caracter)
        sc.close();

        boolean resultado = esVocal(caracterIntroducido);

        System.out.println(resultado);

    }

    public static boolean esVocal (char caracter){

         switch (caracter) {
            case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u':
                return true;
            default:
                return false;
        }
    }
}
