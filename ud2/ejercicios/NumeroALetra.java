package ud2;

/**
 * @author Darianys Rosales
 *         NumeroALetra
 */
public class NumeroALetra {

    public static void main(String[] args) {

        for (int i = 1; i <= 99; i++) {
            System.out.println(convertirALetra(i));
        }

    }

    public static String convertirALetra(int num) {
        String resultado = "";
        if (num >= 1 && num <= 99) {

            int decena = num / 10;
            int unidad = num % 10;

            if (num >= 10 && num <= 19) {

                if (num == 10)
                    resultado = "diez";
                else if (num == 11)
                    resultado = "once";
                else if (num == 12)
                    resultado = "doce";
                else if (num == 13)
                    resultado = "trece";
                else if (num == 14)
                    resultado = "catorce";
                else if (num == 15)
                    resultado = "quince";
                else if (num == 16)
                    resultado = "dieciséis";
                else if (num == 17)
                    resultado = "diecisiete";
                else if (num == 18)
                    resultado = "dieciocho";
                else if (num == 19)
                    resultado = "diecinueve";

            } else if (num >= 20 && num <= 29) {

                if (num == 20) {
                    resultado = "veinte";
                } else {
                    resultado = "veinti" + obtenerUnidad(unidad);
                }
            } else {
                String textoDecena = "";

                if (decena == 0) {
                    resultado = obtenerUnidad(unidad);

                } else {
                    if (decena == 3)
                        textoDecena = "treinta";
                    else if (decena == 4)
                        textoDecena = "cuarenta";
                    else if (decena == 5)
                        textoDecena = "cincuenta";
                    else if (decena == 6)
                        textoDecena = "sesenta";
                    else if (decena == 7)
                        textoDecena = "setenta";
                    else if (decena == 8)
                        textoDecena = "ochenta";
                    else if (decena == 9)
                        textoDecena = "noventa";

                    if (unidad == 0) {
                        resultado = textoDecena;

                    } else {
                        resultado = textoDecena + " y " + obtenerUnidad(unidad);
                    }
                }
            }
        }
        return resultado;
    }

    public static String obtenerUnidad(int unidad) {
        String textoUnidad = switch (unidad) {
            case 1 -> "uno";
            case 2 -> "dos";
            case 3 -> "tres";
            case 4 -> "cuatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "siete";
            case 8 -> "ocho";
            case 9 -> "nueve";
            default -> "";
        };
        return textoUnidad;
    }
}
