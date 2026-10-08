package ud2;

import java.util.Scanner;

public class FechaCorrecta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DÍA , MES y AÑO de una fecha:");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int año = sc.nextInt();
        sc.close();

        if (!(dia > 0 && dia < 32) || !(mes > 0 && mes < 13)) {
            System.out.println("La fecha no es correcta");
        } else if (dia > 28 && mes == 2) {
            System.out.println("La fecha no es correcta");
        } else if (dia > 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            System.out.println("La fecha no es correcta");
        } else {
            System.out.println("La fecha es correcta");
        }
    }
        

}