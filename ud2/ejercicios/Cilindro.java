package ud2;

import java.util.Scanner;

public class Cilindro {

    public static double area(double radio, double altura) {
        return 2 * Math.PI * radio * (altura + radio);

    }

    public static double volumen (double radio, double altura){
        return  Math.PI * Math.pow(radio, 2) * altura;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio del cilindro: \n");
        double radioIntroducido = sc.nextDouble();
        System.out.println("Introduce la altura del cilindro: \n");
        double alturaIntroducida = sc.nextDouble();
        sc.close();


        System.out.printf("El área del cilindro es de: %.2f metros cuadrados.\n",area(radioIntroducido, alturaIntroducida));
        System.out.printf("El volumen del cilindro es de: %.2f metros cúbicos.\n",volumen(radioIntroducido, alturaIntroducida));


        

    }
}
