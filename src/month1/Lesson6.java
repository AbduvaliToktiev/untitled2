package month1;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("num : ");
        int num = sc.nextInt();
        int sum = 0;

        if (num > 0){

            while (num >= 1 ){
               sum = sum + num;
               num--;
            }
        }else {
            System.out.println("error");
        }

        System.out.println("sum : " + sum);
    }
}

class B6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 0 && a <= 9) {
            int b = 1;
            while (b <= 9){
                System.out.println(a + " x " + b + " = " + a * b);
                b++;
            }
        }else{
            System.out.println("error");
        }
    }
}

class C6 {
    public static void main(String[] args){
        int a = 1;
        while(a <= 512){
            System.out.print(a + " ");
            a = a * 2;
        }
    }
}

class D6{
    public static void main(String[] args){
        int a = 1;
        int b = 1;

        System.out.println("+----+----+----+----+----+----+----+----+----+");

        while (a <= 9) {
            while (b <= 9) {
                String s = (a * b) < 10
                ? "| " + (a * b) + "  "
                : "| " + (a * b) + " ";
                System.out.print(s);
                b++;
            }
            System.out.print ("|");
            System.out.println();
            System.out.println("+----+----+----+----+----+----+----+----+----+");
            a++;

            b = 1;
        }
    }
}