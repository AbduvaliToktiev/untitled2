package month1;

import java.util.Scanner;

public class Lesson10_1 {
    public static void main(String[] args) {
int sumResult = sum(10);
        System.out.println(sumResult);
    }
        static int sum(int num) {
            if (num == 0) return 0;
            return num + sum(num - 1);
        }
}

class B11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumResult = sum(num);
        System.out.println(sumResult);
    }
    static int sum(int num) {
        if (num == 0) return 0;
        return (num % 10) + sum(num/10);
    }
}

class C11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long factor = factorial(num);
        System.out.println(factor);
    }
    static long factorial(long num) {
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }
}

class D11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long fib = fibon(num);
        System.out.println(fib);
    }
    static long fibon(long num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return  fibon(num - 1) + fibon(num - 2);
    }
}

