import java.util.Scanner;

public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {

        //Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las coordenadas del punto 1 (x, y) :");
        Double x1 = sc.nextDouble();
        Double y1 = sc.nextDouble();
        System.out.println("Introduce las coordenadas del punto 2 (x, y) :");
        Double x2 = sc.nextDouble();
        Double y2 = sc.nextDouble();
        sc.close();

        //Cálculo de la distancia

        Double distancia = Math.sqrt( (Math.pow ( ( x2 - x1 ), 2 ) + Math.pow ( ( y1 - y2 ), 2 ) ) );

        //Resultado

        System.out.println("La distancia entre los dos puntos es de : " +distancia);
    }
}
