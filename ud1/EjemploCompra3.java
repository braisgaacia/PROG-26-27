

/** @author Brais  **/

import java.time.LocalDateTime;
import java.util.Scanner;

public class EjemploCompra3 {
    public static void main(String[] args) {
        final double IVA = 0.21;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el precio del producto: ");
        Double precioProducto = sc.nextDouble();

        System.out.println("Introduce la cantidad del producto: ");
        int cantidadProducto = sc.nextInt();
        sc.close();

        double totalSinIva = precioProducto * cantidadProducto;
        double ivaAnadido = totalSinIva * IVA;
        double totalConIva = totalSinIva + ivaAnadido;

        System.out.println("EJEMPLO COMPRA");
        System.out.println("==================");
        System.out.println("Fecha y Hora de Compra: " + LocalDateTime.now());
        System.out.println("Precio sin iva: " + totalSinIva + "euros");
        System.out.printf("IVA ( 21 ): %.2f euros%n", ivaAnadido);
        System.out.printf("El precio total es de %.2f euros ", totalConIva);

    }
}
