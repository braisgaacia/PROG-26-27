import java.util.Scanner;

public class CalculoAreaTerreno {

    public static void main(String[] args) {

        // Entrada
        System.out.println("CÁLCULO ÁREA TERRENO");
        System.out.println("====================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la medida de A , B y C de mandera ordenada :");
        double medidaA = sc.nextDouble();
        double medidaB = sc.nextDouble();
        double medidaC = sc.nextDouble();
        sc.close();

        // Cálculo
        double areaRectangulo = medidaB * medidaC;
        double areaTriangulo = ((medidaA - medidaC) * medidaC ) / 2;

        double perimetroRectangulo = medidaB * 2 + medidaC * 2;
        double hipotenusaTriangulo = (Math.pow(medidaA - medidaC), 2)

    }

}
