package ud3.ejercicios;


import java.util.Scanner;

public class ArrayNumeros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números (n): ");
        int x = sc.nextInt();


        double[] numeros = new double[x];

        System.out.println("Introduce " + x + " números separados por un esapcio o pulsando ENTER:");

        for(int posiciones = 0 ; posiciones <= x - 1 ; posiciones++){

            double numerointroducido = sc.nextDouble();

            numeros[posiciones] = numerointroducido;
        }

        sc.nextDouble();

        int contadorCeros = 0;

        int contadorPositivos = 0;
        Double sumaPositivos = 0.;

        int contadorNegativos = 0;
        Double sumaNegativos = 0.;


        for ( int calcularPosicion = 0 ; calcularPosicion <= x - 1 ; calcularPosicion++){

            if (numeros[calcularPosicion] == 0) {
                contadorCeros++;
            } else if (numeros[calcularPosicion] > 0) {
                contadorPositivos++;
                sumaPositivos = sumaPositivos + numeros[calcularPosicion];
            } else {
                contadorNegativos++;
                sumaNegativos = sumaNegativos + numeros[calcularPosicion];
            }
        }

        Double mediaPositivos = sumaPositivos / contadorPositivos;
        Double mediaNegativos = sumaNegativos / contadorNegativos;

        System.out.println("La media de los números positivos es de : " + mediaPositivos);
        System.out.println("La media de los números negativos es de : " + mediaNegativos);
        System.out.println("El número de ceros introducidos es de : " + contadorCeros);


}
}

