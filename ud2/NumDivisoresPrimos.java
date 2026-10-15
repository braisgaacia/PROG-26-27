package ud2;

import java.util.Scanner;

public class NumDivisoresPrimos {


    
    public static int contarDivisoresPrimos (int numero) {
        int contadorPrimos = 0;

        for (int i = 1 ; i <= numero ; i++) { //GENERA DIVISORES DEL NÚMERO PRINCIPAL QUE SEAN MENORES O IGUALES AL NÚMERO PRINCIPAL
            if (numero % i == 0 && Primo.esPrimo(i) ) { // Comprueba que sean divisores exactos y además que sean primos ( llamando a el comprobador de divisores primos)
                contadorPrimos++;
            }
        }
        return contadorPrimos;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nIntroduce un número para saber sus divisores primos: ");
        int numeroIntroducido = sc.nextInt();
        sc.close();

        int resultados = contarDivisoresPrimos(numeroIntroducido);

        System.out.println("El número tiene " + resultados + " divisores primos");
    }
}
