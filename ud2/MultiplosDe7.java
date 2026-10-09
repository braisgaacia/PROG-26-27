package ud2;

public class MultiplosDe7 {

    public static void main(String[] args) {

        final int NUMERO_MAX = 100;
        final int DIVISOR = 7;

        for (int multiplos = DIVISOR ; multiplos < NUMERO_MAX ; multiplos++) {

            if (multiplos % DIVISOR == 0) {
                System.out.println(multiplos);
            }
            
        }
    }

}
