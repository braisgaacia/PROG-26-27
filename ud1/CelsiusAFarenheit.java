import java.util.Scanner;

public class CelsiusAFarenheit {

    public static void main(String[] args) {
        
        //Entrada
        System.out.println("CONVERSOR DE CELSIUS A FARENHEIT");
        System.out.println("================================");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura en Celsius: ");
        Double celsius = sc.nextDouble();
        sc.close();

        //Cálculo

        Double farenheit = ( celsius * 9 ) / 5 + 32;
        
        //Resultado

        System.out.println("======================");
        System.out.println("La temperatura en Farenheit es de " + farenheit);
    }

}
