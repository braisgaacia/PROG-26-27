import java.util.Scanner;

public class Entradas {

    public static void main(String[] args) {

        final int DESCUENTO = 5;

        // Información
        System.out.println("ENTRADAS PARQUE ACUÁTICO");
        System.out.println("========================");

        // Entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de entradas infantiles (15,50€): ");
        int entradasInfantiles = sc.nextInt();
        System.out.println("Introduce la cantidad de entradas de adultos (20 €): ");
        int entradasAdultos = sc.nextInt();

        //Cálculo total
        double total = 15.50 * entradasInfantiles + 20 * entradasAdultos;
        //Cálculo "descuento"
        double descuentoAplicado = total * ( 0.05 );
        double totalConDescuento = total - descuentoAplicado;
        //Saber si hay descuento
        boolean hayDescuento = total >= 100;

        //Salida
        System.out.println("TOTAL");
        System.out.println("==========");
        System.out.println( hayDescuento == true ? "Precio base : " + total : "Precio TOTAL : " + total + " €" );
        System.out.println( hayDescuento == true ? "Descuento ( " + DESCUENTO + " % ) : - " + descuentoAplicado + " €" : "");
        System.out.println(hayDescuento == true ? "Precio TOTAL: " + totalConDescuento + " €": "");

    


    }

}
