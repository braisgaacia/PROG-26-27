package ud2.ejerciciosLargos;

import java.util.Scanner;

public class ChiclesDeRegalo {

    public static int totalChicles(int numIniciales, int numOferta, int chiclesGratis) {

        if (numIniciales != -1 && numOferta != -1 && chiclesGratis != -1) {

            if (numOferta == 0) {
                return numIniciales;
            } else if (numOferta < numIniciales) {
                if (chiclesGratis < numOferta) {
                    return numIniciales + numOferta + chiclesGratis;
                } else
                    return -1;
            } else { // FALTA POR ENTENDER //
                int totalComidos = numIniciales;
                int envoltorios = numIniciales;

                while (envoltorios >= numOferta) {
                    int nuevosChicles = (envoltorios / numOferta) * chiclesGratis;
                    totalComidos += nuevosChicles;
                    envoltorios = (envoltorios % numOferta) + nuevosChicles;
                }

                return totalComidos;

            }

        } else
            return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de CHICLES INICIALES , ENVOLTORIOS PARA OFERTA y CHICLES DE REGALO:\n");
        int chiclesIniciales = sc.nextInt();
        int envoltoriosOferta = sc.nextInt();
        int chiclesRegalo = sc.nextInt();
        sc.close();

        System.out.println(
                "El total de chicles es de: " + totalChicles(chiclesIniciales, envoltoriosOferta, chiclesRegalo));
    }

}
