import java.util.Scanner;

public class IVA {

    public static void main(String[] args) {
        
        //Entrada
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base imponible del producto : ");
        Double baseImponible = sc.nextDouble();
        System.out.println("Introduce el porcentaje del IVA que se debe aplicar : ");
        Double iva = sc.nextDouble();
        sc.close();

        //Cálculo

        Double ivaAñadido = ( iva / 100 ) * baseImponible;
        Double precioTotal = ivaAñadido + baseImponible;
        
        //Salida

        System.out.println("==============");
        System.out.println("Base imponible :" + baseImponible);
        System.out.println("Iva añadido ( " + iva + " % ) :" + ivaAñadido);
        System.out.println("Total con IVA : "  +precioTotal);

    }

}
