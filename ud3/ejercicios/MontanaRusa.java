package ud3.ejercicios;

public class MontanaRusa {

    public static int contarPicos(int[] alturas) {

        int posicionAnterior;
        int posicionActual;
        int posicionSiguiente;
        int contadorPicos = 0;

        for (int posicion = 0; posicion < alturas.length; posicion++) {

            if (posicion == 0) {
                posicionAnterior = alturas[alturas.length - 1];
            } else {
                posicionAnterior = alturas[posicion - 1];
            }

            posicionActual = alturas[posicion];

            if (posicion == alturas.length - 1) {
                posicionSiguiente = alturas[0];
            } else {
                posicionSiguiente = alturas[posicion + 1];
            }

            if (posicionActual > posicionAnterior && posicionActual > posicionSiguiente) {
                contadorPicos++;
            }

        }
        return contadorPicos;
    }

    public static void main(String[] args) {
        int[] primertest =  { 1, 2, 3, 2, 1, 0, 1, 2, 3, 2, 1 };
        System.out.println(contarPicos(primertest));
    }

}
