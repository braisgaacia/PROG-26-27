package ud2;

public class Potencia {

    public static double calcularExponenteRecursiva(double base, int potencia) {
        if (potencia == 0) {
            return 1;
        } else {
            return base = base * calcularExponenteRecursiva(base, (potencia - 1));
        }
    }

    public static double calcularExponenteIterativa(double base, int potencia) {

        double resultado = 1;
        if (potencia == 0) {
            return 1;
        } else {
            for (int i = 1; i <= potencia; i++) {
                resultado = resultado * base;
            }
        }
        return resultado;

    }


    

    public static void main(String[] args) {

        System.out.println(calcularExponenteRecursiva(2, 10)); // Recursiva
        System.out.println(calcularExponenteIterativa(2, 10)); // Iterativa
    }

}
