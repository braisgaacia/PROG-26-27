
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

/* @author Brais */

public class ConvertirExpresiones {
    public static void main(String[] args) {

        //Apartado A
        double apartadoA = 3 / 2 + 4 / 3;

        System.out.println("Resultado del apartado a) es " + apartadoA);

        //Apartado B
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el Valor de X");
        Double valorX = sc.nextDouble();

        System.out.println("Introduce el Valor de Y");
        Double valorY = sc.nextDouble();
        sc.close();
    
        double apartadoB = (1 / valorX - 5) - ((3 * valorX * valorY )/4);

        System.out.println("Resultado del apartado b) es " + apartadoB);
    }
}
