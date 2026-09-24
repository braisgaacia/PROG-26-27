import java.util.Random;

public class NumeroMayor {

public static void main(String[] args) {
    
    
    final int NUMERO1 = 12;
    final int NUMERO2 = 150;

    //Generar aleatorios(1)
    Random rnd = new Random();
    int aleatorio1 = rnd.nextInt(NUMERO1, NUMERO2 +1 );
    int aleatorio2 = rnd.nextInt(NUMERO1, NUMERO2 + 1);
    System.out.println("Los números aleatorios son " + aleatorio1 + " y " + aleatorio2);
    //Calcular el mayor (1)
    int mayor = Math.max(aleatorio1, aleatorio2);
    System.out.println("El máximo es " + mayor);

    //Generar aleatorios (2)
    int aleatorio3 = (int) (NUMERO1 + Math.random() * (NUMERO2 - NUMERO1 + 1));
    int aleatorio4 = (int) (NUMERO1 + Math.random() * (NUMERO2 - NUMERO1 + 1));
    System.out.println("Los números aleatorios son " + aleatorio3 + " y " + aleatorio4 );
    //Calcular el mayor (2)
    System.out.println(aleatorio3 > aleatorio4 ? "El número máximo es " + aleatorio3 : "El número máximo es " + aleatorio4);


}
    
}
