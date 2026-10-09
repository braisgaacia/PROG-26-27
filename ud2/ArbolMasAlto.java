package ud2;

import java.util.Scanner;

public class ArbolMasAlto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la etiqueta del árbol (etiqueta vacía para terminar):");
        String etiqueta = sc.nextLine();
        System.out.println("Introduce la altura del árbol (-1 para terminar):");
        double altura = sc.nextDouble();

        double alturaMax = altura;
        String etiquetaMax = etiqueta;

        while (etiqueta != null && altura != -1) {
            
            alturaMax = Math.max(alturaMax, altura);

            if (altura == alturaMax) {
                etiquetaMax = etiqueta;
            }

            sc.nextLine();
            System.out.println("Introduce un nuevo valor para la etiqueta (etiqueta vacía para terminar):");
            etiqueta = sc.nextLine();
            System.out.println("Introduce la altura del árbol (-1 para terminar):");
            altura = sc.nextDouble();
            
        }

        sc.close();
        System.out.println("El árbol más alto es: " + etiquetaMax + ", y su altura es de " + alturaMax + " cm.");

        
    }   

}
