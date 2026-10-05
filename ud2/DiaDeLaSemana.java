package ud2;

import java.util.Scanner;

public class DiaDeLaSemana {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número comprendido entre 1 y 7 correspondiente a un día de la semana:");
    int numSemana = sc.nextInt();
    sc.close();

    if (numSemana > 7 || numSemana < 1) {
        System.out.println("No has introducido un número comprendido entre 1 y 7");
    
    } else if (numSemana == 1) {
        System.out.println("Lunes");
    } else if (numSemana == 2) {
        System.out.println("Martes");
    } else if (numSemana == 3) {
        System.out.println("Miércoles"); 
    } else if (numSemana == 4){
        System.out.println("Jueves");
    } else if (numSemana == 5 ) {
        System.out.println("Viernes");   
    } else if (numSemana == 6) {
        System.out.println("Sábado");
    } else if (numSemana == 7) {
        System.out.println("Domingo");
    }
}

}

