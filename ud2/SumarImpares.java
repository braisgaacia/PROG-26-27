package ud2;

public class SumarImpares {

    public static void main(String[] args) {

        final int MAX_NUM = 10;

        int contadorImpares = 0;
        int sumaImpares = 0;

        for ( int i = 1 ; contadorImpares < MAX_NUM ; i++){
            if (i % 2  != 0) {
                sumaImpares = sumaImpares + i;
                contadorImpares = contadorImpares + 1;
            }
        }
        

        System.out.println("La suma es de : " + sumaImpares);
    }

}
