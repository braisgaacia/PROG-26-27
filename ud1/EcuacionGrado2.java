import java.util.Scanner;

public class EcuacionGrado2 {

    public static void main(String[] args) {

        // Entrada de datos

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los valores de a , b y c para calcular la ecuación de segundo grado: ");
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        sc.close();

        // Cálculo

        // Calcular la raíz por separado para saber luego si es real o no
        Double numeroRaíz = Math.pow(b, 2) - 4 * a * c;

        Double resultadox1 = ( ( -b ) + Math.sqrt ( numeroRaíz ) ) / ( 2 * a );
        Double resultadox2 = ( ( -b ) - Math.sqrt ( numeroRaíz ) ) / ( 2 * a );

        // Resultado

        System.out.println("================");
        System.out.println("RESULTADOS");
        System.out.println(numeroRaíz >= 0 ? "El resultado es " + resultadox1 : "No tiene solución real");
        System.out.println(numeroRaíz >= 0 ? "El resultado es " + resultadox2 : "No tiene solución real");

    }

}
