

/** @author Brais **/

public class EjemploCompra2 {
    public static void main(String[] args) {
        final double IVA = 0.21;
        double precio = 5.75;
        short cantidad = 3;
        double totalSinIva = precio * cantidad;
        double ivaAñadido = totalSinIva * IVA;
        double totalConIva= totalSinIva + ivaAñadido;

        System.out.println("Precio sin iva: "+ totalSinIva +" €");
        System.out.println("Iva ( 21% ): "+ ivaAñadido +" €");
        System.out.println( "El precio total es de " + totalConIva +" €");
    }
}