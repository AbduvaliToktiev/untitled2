package month1;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        short a, b, c, d;
        Scanner sc = new Scanner(System.in);
        b = sc.nextShort();
        c = sc.nextShort();
        d = sc.nextShort();
        System.out.println("a = " + (100 - (b + c * 2 * 3 - 10) / 2 *(4 - d)));
    }
}

class Continue {
    public static void main(String[] args) {
        double d = Math.round(
                Math.sqrt(
                        Math.pow(5.5 - 1.5, 2) + Math.pow(3.5 - 2, 2)
                ) * 1000.0) / 1000.0;

        System.out.println(d);
    }
}

class Som100 {
    public static void main(String[] args){
        float x=3/4f;
        System.out.printf("%.1f\n" , x);
    }
}