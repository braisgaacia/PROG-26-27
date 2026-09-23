
import java.util.Scanner;

public class EjemploAPI {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        String nombre = sc.next();

        System.out.println("Escribe un número entero");
        int numero = sc.nextInt();

        System.out.println("Escribe un número  con decimales");
        double numeroReal = sc.nextDouble();
        sc.close();

        System.out.println(nombre + ", has escrito los números " + numero + "y" + numeroReal);
    }
}
