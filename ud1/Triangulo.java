import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        // Entrada de datos

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los datos de base y altura: ");
        double base = sc.nextDouble();
        double altura = sc.nextDouble();
        sc.close();

        // Cálculo del Área

        double area = (base * altura) / 2;

        // Salida de datos

        System.out.printf("El área del triángulo es de %.2f", area);

    }
}
