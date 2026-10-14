package ud2;

import java.util.Scanner;

public class ComprobarHora {

    static void compruebaHora (int hora, int minutos, int segundos){

        boolean horaCorrecta = !(hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59);
        System.out.println(horaCorrecta);

    }

    static boolean esHoraCorrecta (int hora, int minutos, int segundos){

        return !(hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59);

    }

    public static void main(String[] args) {
        compruebaHora(0, 0, 0);
        compruebaHora(-1, 0, 0);
        compruebaHora(0, 60, 0);
        compruebaHora(0, 0, 60);

        System.out.println(esHoraCorrecta(23, 59, 0));

    }
}
