package ud2;

import java.util.Scanner;

public class DiaDeLaSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número comprendido entre 1 y 7 correspondiente a un día de la semana:");
        int numSemana = sc.nextInt();
        sc.close();

        switch (numSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("ERROR");
        }
    }

}
