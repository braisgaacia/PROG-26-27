package ud2.examen;

import java.util.InputMismatchException;
import java.util.Scanner;

/** @author Brais García Piñeiro */

public class SubidaAlquiler {

    public static double subidaAlquiler(double rentaActual, double precioMaximoReferencia) {

        if (rentaActual < 0 || precioMaximoReferencia < 0) {
            return 0;
        }

        if (rentaActual >= precioMaximoReferencia) {
            return rentaActual;
        } else {
            Double rentaSubida = rentaActual * 1.20;

            if (rentaSubida >= precioMaximoReferencia) {
                return precioMaximoReferencia;
            } else {
                return rentaSubida;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double precioAlquiler = 0.;
        Double precioReferencia = 0.;

        try {
            System.out.println("Introduce el precio del alquiler:");
            precioAlquiler = sc.nextDouble();
            System.out.println("Introduce el precio de referencia:");
            precioReferencia = sc.nextDouble();

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error de tipo de dato . No se puede calcular el precio. Vuelva a iniciar el programa para volver a empezar.");
           
        }

        Double subida = subidaAlquiler(precioAlquiler, precioReferencia) - precioAlquiler;
        
        System.out.println("El precio máximo de subida del alquiler es de : " + subidaAlquiler(precioAlquiler, precioReferencia));
        System.out.println("Solo puede subir " + subida + " €");
       

    }

}
