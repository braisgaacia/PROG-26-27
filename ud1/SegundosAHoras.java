import java.util.Scanner;

public class SegundosAHoras {

    public static void main(String[] args) {
        
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de segundos a convertir : ");
        int segundosScanner = sc.nextInt();
        sc.close();

        //Cálculo
        int horas = segundosScanner / 3600;
        int restoHoras = segundosScanner % 3600;

        int minutos = restoHoras / 60;

        int segundos = restoHoras % 60;

        //Resultado

        System.out.println("El tiempo de " +segundosScanner + " segundos es de " + horas + " Horas , " + minutos + " minutos y " + segundos + " segundos. ");
    }

}
