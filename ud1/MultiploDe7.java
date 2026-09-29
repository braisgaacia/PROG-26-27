import java.util.Scanner;

public class MultiploDe7 {

    public static void main(String[] args) {
        
        //Entrada
        System.out.println("MÚLTIPLO DE 7");
        System.out.println("=============");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int numEntero = sc.nextInt();
        sc.close();

        //Cálculo
        int numSumar = ((-(numEntero % 7) + 7) % 7);

        //Salida
        
        System.out.println("El número que hay que sumarle para que sea múltiplo de siete es " +numSumar);

    }

}
