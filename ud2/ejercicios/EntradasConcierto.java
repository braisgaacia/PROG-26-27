package ud2;

import java.util.Scanner;

public class EntradasConcierto {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el aforo máximo del local: ");
        int aforoMax = sc.nextInt();
        System.out.println("Introduce el precio de la entrada: ");
        Double precioEntrada = sc.nextDouble();
        System.out.println("Introduce el número de entradas vendidas: ");
        int entradasVendidas = sc.nextInt();
        sc.close();

        if (entradasVendidas <= ( 0.2 * aforoMax)) {
            System.out.println("Concierto CANCELADO: 0 euros recaudados.");
        } else if (entradasVendidas <= ( 0.5 * aforoMax)) {
            precioEntrada = precioEntrada * 0.75;
            Double precioRebajado = entradasVendidas * precioEntrada;
            System.out.println("PRECIO REBAJADO: " + precioRebajado + " euros recaudados");
        } else {
            Double precioTotal = entradasVendidas * precioEntrada;
            System.out.println(precioTotal + " euros recaudados.");
        }
    }
}
