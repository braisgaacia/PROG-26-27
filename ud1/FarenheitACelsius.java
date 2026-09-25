import java.util.Scanner;

public class FarenheitACelsius {

    public static void main(String[] args) {

        // Entrada
        System.out.println("CONVERSOR DE FARENHEIT A CELSIUS");
        System.out.println("================================");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura en Farenheit: ");
        Double farenheit = sc.nextDouble();
        sc.close();

        // Cálculo

        Double celsius = ( 5. * ( farenheit - 32 ) ) / 9; // "." Para convertir el int en decimal

        // Resultado

        System.out.println("======================");
        System.out.printf("La temperatura en Celsius es de %.2f%n " ,celsius);

    }
}