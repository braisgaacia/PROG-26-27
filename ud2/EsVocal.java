package ud2;

import java.util.Scanner;

public class EsVocal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un carácter:");
        String caracterIntroducido = sc.nextLine();           //sc.next lee lo que se escribe por teclado y .CharAt (0) la posicion 0 (el primer caracter)
        sc.close();

        boolean resultado = esVocal(caracterIntroducido);

        System.out.println(resultado);

    }

    public static boolean esVocal (String caracter){
        //.equals para comparar contenido de los textos
        if (caracter.equals("a") || caracter.equals("e") || caracter.equals("i") || caracter.equals("o") || caracter.equals("u")) { 
            return true;
        }else {
            return false;
        }
    }
}
