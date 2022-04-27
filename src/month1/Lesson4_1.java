package month1;

import java.util.Scanner;

public class Lesson4_1 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        double aa = (a * 5) / 18;
        if (a > b) {
            System.out.println(aa);
        }
        else if  ( a < b ) {
            System.out.println(b);
        }
        else {
            System.out.println("Они равны");
        }
    }
}

class B4_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("hours: ");

        int hours = sc.nextInt();

        double timeDiv = hours%5;

        if (timeDiv <= 3){
            System.out.println("green");
        }else {
            System.out.println("red");
        }
    }
}