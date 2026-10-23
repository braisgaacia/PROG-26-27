package ud2.corregidos;

import java.util.Random;


public class GenerarAleatorios {
    public static void main(String[] args) {

        String respuesta = IO.readln("¿Cuántos números aleatorios quieres generar? "); 
        int cantidad = Integer.parseInt(respuesta);

        getAleatorios(cantidad, 1, 12000);
    }

    public static void getAleatorios(int cant, int min, int max) {

        Random rng = new Random();
        int serie = 1;

        for (int i = 0; i < cant; i++) {
            System.out.println("==== Serie " + serie + " ====");
            System.out.println(rng.nextInt(min, max + 1));
            serie++;
        }
    }
}
