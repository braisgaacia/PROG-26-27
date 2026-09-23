
import java.util.Scanner;

/* @author Brais */

public class Circulo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio del círculo: ");
        Double radio = sc.nextDouble();
        sc.close();

        final double PI = Math.PI;

        Double perimetro = 2 * PI * radio;
        Double area = PI *  Math.pow(radio, 2);

        System.out.println("==============");
        System.out.println("RESULTADO");
        System.out.println("==============");
        System.out.printf("Área del círculo: %.2f %n" , area);
        System.out.printf("Perímetro del círculo: %.2f " , perimetro);

    }
}