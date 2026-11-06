package ud2;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class JuegoCuantoTiempo {

    public static void main(String[] args) {

        final int MINIMO_SEGUNDOS = 5;
        final int MAXIMO_SEGUNDOS = 30;

        Random rnd = new Random();
        int segundos = rnd.nextInt(MINIMO_SEGUNDOS, MAXIMO_SEGUNDOS + 1);

        System.out.println("Pulsa ENTER en " + segundos + " segundos.\n");

        LocalTime tiempoInicial = LocalTime.now();
        int segundosIniciales = tiempoInicial.getSecond();
        int minutosIniciales = tiempoInicial.getMinute();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        LocalTime tiempoFinal = LocalTime.now();
        int segundosFinales = tiempoFinal.getSecond();
        int minutosFinales = tiempoFinal.getMinute();

        int diferenciaSegundos;

        if (minutosFinales > minutosIniciales) {
            diferenciaSegundos = ( 60 - segundosIniciales ) + segundosFinales;
        } else {
            diferenciaSegundos = segundosFinales - segundosIniciales;
        }

        if (diferenciaSegundos == segundos) {
            System.out.println("Felicidades ! Has acertado en los segundos exactos ");
        } else if (diferenciaSegundos < segundos) {
            int segundosAdelantado = segundos - diferenciaSegundos;
            System.out.println("Te has adelantado , te han faltado " + segundosAdelantado + " segundos.");
        } else {
            int segundosAtrasado = diferenciaSegundos - segundos;
            System.out.println("Te has atrasado " + segundosAtrasado + " segundos.");
        }

    }
}
