package ud2;

import java.util.Scanner;

public class UnDiaMas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una fecha ( DÍA, MES Y AÑO )");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();
        sc.close();

        //Suponiendo que todos los meses del año tienen 30 días.
        int diaSumado = dia +1;

        if (diaSumado > 30) {
            mes = mes + 1;
            diaSumado = 1;
         if (mes > 12) {
            mes = 1;
            ano = ano + 1;
            }
        }

        System.out.println(diaSumado);
        System.out.println(mes);
        System.out.println(ano);

    }
}
