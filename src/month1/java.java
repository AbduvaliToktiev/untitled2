package month1;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        System.out.println("Введите 4 числа");
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.println(a +"," +b +"," +c +"," +d +",");
        System.out.println(a*2 +"," +b*2 +"," +c*2 +"," +d*2 +",");
        System.out.println((a*2) + (b*2) + (c*2) + (d*2));
    }
}



