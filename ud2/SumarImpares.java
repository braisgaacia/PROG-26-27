package ud2;

public class SumarImpares {

    public static void main(String[] args) {

        final int MAX_IMPARES = 10;

        int contadorImpares = 0;
        int sumaImpares = 0;

        for ( int i = 0; contadorImpares < MAX_IMPARES ; i++){
            if (i % 2  != 0) {
                sumaImpares = sumaImpares + i;
                contadorImpares++;
            }
        }
        

        System.out.println("La suma de los " + MAX_IMPARES + " primeros impares es de : " + sumaImpares);
    }

}
