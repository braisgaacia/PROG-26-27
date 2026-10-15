package ud2;

import java.util.Scanner;

public class EsVocalAmpliado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"cp850"); //Cp850 (consola de Windows) //
        System.out.println("Introduce un carácter:");
        String caracterIntroducido = sc.nextLine();           //sc.next lee lo que se escribe por teclado y .CharAt (0) la posicion 0 (el primer caracter)
        sc.close();

        boolean resultado = esVocal(caracterIntroducido);

        System.out.println(resultado);

    }

    public static boolean esVocal (String caracter){
        
        String vocalesValidas = "aeiouáéíóúäëïöüAEIOUÁÉÍÓÚÄËÏÖÜ";

        return vocalesValidas.contains(caracter);
    }
}
