package ud2;

import java.util.Scanner;

public class Factura {

    public static void main(String[] args) {

        final double IVA = 0.21;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del producto:");
        double precio = sc.nextDouble();
        System.out.println("Introduce la cantidad del producto:");
        int cantidad = sc.nextInt();
        sc.close();

        double precioSinIva = ( precio * cantidad ) ;
        double iva = precioSinIva * IVA;
        double precioConIva = precioSinIva + iva;
        
        if (precioConIva > 100) {
            double descuento = precioConIva * 0.05;
            double precioConDescuento = precioConIva - descuento;
            System.out.println("El precio total es de: (CON DESCUENTO):" +precioConDescuento);
        } else {

            System.out.println("El precio total es de; " +precioConIva);
        }
        

    }
}
