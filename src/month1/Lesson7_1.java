package month1;

import java.util.Scanner;

public class Lesson7_1 {
    public static void main(String[] args){
        int powNum = 1;
        while (powNum <= 10) {
            System.out.println(Math.pow(2, powNum));
            powNum++;

        }
    }
}

class B7_1{
    public static void main(String[] args){
        for (int i = 1; i < 10; i++){
            System.out.println(Math.pow(2, i));
        }
    }
}

class C7_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i < 11; i++){
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
}

class D7_1{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int sum = 0;
       if (a < b){
           for(int i = a; i <= a; i++){
               if (i % 2 != 0) sum +=i;
           }

       }
       sum = sum + b;
        System.out.println(a);
       for (int i = a; i < b; i++){
           if (i % 2 != 0) sum+=i;
               System.out.println(sum);

           }
       }
    }

class E7_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int count = 0;
        double b = 0;
        while (a != 0) {
            count++;
            sum += a;
            a = sc.nextInt();

        }
        a = a / 10;
        b = sum / count;
        System.out.println(count );
        System.out.println(sum);
        System.out.println(b);
    }
}

class F1_7{
    public static void main(String[] args){
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i = 1; i <= abc.length(); i++){
            System.out.println(abc.substring(0, i));
        }
    }
}