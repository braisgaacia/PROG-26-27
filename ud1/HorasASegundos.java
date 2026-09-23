import java.util.Scanner;

public class HorasASegundos {

public static void main(String[] args) {
    
    //Entrada
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el número de Horas , Minutos y Segundos :");
    int horas = sc.nextInt();
    int minutos = sc.nextInt();
    int segundos = sc.nextInt();
    sc.close();

    //Cálculo

    int horasASegundos = horas * 3600;
    int minutosASegundos = minutos * 60;

    int totalSegundos = horasASegundos + minutosASegundos + segundos;

    //Resultado

    System.out.println("El total de segundos es de : " +totalSegundos);


}

}
