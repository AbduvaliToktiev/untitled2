package month1;

import java.util.Scanner;

public class Lesson3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tarif = 1.5;

        System.out.print("Give me 1st ");
        double before = scanner.nextDouble();

        System.out.print("Give me 2st");
        double now = scanner.nextDouble();

        double r = now - before;

        System.out.println("for payment " + Math.abs(r * tarif));

    }
}

class B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ax2 + bx + c = 0");

        System.out.print("a  ");
        double a = scanner.nextDouble();
        System.out.print("b ");
        double b = scanner.nextDouble();
        System.out.print("c ");
        double c = scanner.nextDouble();

        double d = Math.pow(b,2) - (4 * a * c);

        double x1 = (-b + Math.sqrt(d))/2*a;
        double x2 = (-b + Math.sqrt(d))/2*a;

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}

class C4{
    public static void main(String[] args){
        int before = 0;
        int now = 1000;

        int klv = Math.abs(now-before);
        int level1 = Math.min(115, klv);
        int levelFinish = Math.max(level1, 0);

        int level2 = Math.min(190, klv);
        int Level2Finish = Math.max(level2, 115);

        int level3 = Math.min(190, klv);
        int level3Finish = Math.max(level3, 0);
    }
}