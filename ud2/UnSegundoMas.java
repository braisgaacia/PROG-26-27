package ud2;

import java.util.Scanner;

public class UnSegundoMas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una hora con el siguiente formato : Horas , Minutos , Segundos:");
        int horas = sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();

        if (horas > 23 || horas < 0) {
            System.out.println("Formato no válido");
        } else if (minutos > 59 || minutos < 0) {
            System.out.println("Formato no válido");
        } else if (segundos > 59 || segundos < 0) {
            System.out.println("Formato no válido");
        }

        int segundoSuma = segundos + 1;

        if (segundoSuma >= 60) {
            segundos = 0;
            minutos = minutos + 1;
        } else if (minutos >= 60) {
            minutos = 0;
            horas = horas + 1;
        } else
            segundos = segundos + 1;

        System.out.println("Hora con un segundo más: " + horas + ":" + minutos + ":" + segundos);
    }

}
