package month1;

import java.util.Scanner;

public class Lesson6_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 0;
      while(a > 0){
          a = a / 10;
          count++;
      }
        System.out.println(count);
    }
}

class B6_1{
    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (0 < a && b > 0 && b > a) {
         while (a <= b) {
             System.out.println(a + "*" + a + "=" + (a * a));
             a++;
         }
        } else System.out.println("Sorry");


    }
}

class C6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int count = 0;
        int sum = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        if (0 < a && 0 < b) {
            while (count < b) {
                sum = sum + a;
                count++;
            }
        System.out.println(sum);
    }
        else System.out.println("Sorry");

}
    }

class D6_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (count < Math.abs(b)) {
            sum = sum + Math.abs(a);
            count++;
        }
        if ((a < 0 && b > 0) || (b < 0 && a > 0)) {
            System.out.println("-" + sum);
        } else System.out.println(sum);
    }
}

class F6_1{
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a >= 0) {
            System.out.println(a);
            a = sc.nextInt();
        }
        System.out.println("Bye");
    }
}

class G6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num : ");
        int a = sc.nextInt();
        boolean b = false;

        if (a >= 10000 && a <= 99999) {
            int i = 1;
            int x, y =0;
            while (i <= 5) {
                if (i != 1) {
                    if (i != 1)
                        if (y == a % 10) {
                            b = true;
                            break;
                        }
                }
                    y = a % 10;
                    a = (a - y) / 10;
                    i++;
                }
            } else {
                System.out.println("error");
            }

            System.out.println(b);
        }
    }
