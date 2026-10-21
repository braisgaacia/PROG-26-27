package ud2;

public class MCD {
    
    public static int mcd (int a, int b){
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (b > a) {
            return mcd(a, b -a);
        } else {
            return mcd(a - b, b);
        }
    }

    public static void main(String[] args) {
        
        System.out.println(mcd(5, 4));
        System.out.println(mcd(3, 10));
        System.out.println(mcd(1, 0));
        System.out.println(mcd(0, 2));
    }
}
