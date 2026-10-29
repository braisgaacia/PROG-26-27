package ud2;

import java.util.Scanner;

public class GradosRadianes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuántos grados tiene un ángulo");
        int grados = sc.nextInt();
        sc.close();

        System.out.println(radianes(grados));


    }

    public static Double radianes (int grados){

        return  grados % 360  * Math.PI / 180;
    }
}
