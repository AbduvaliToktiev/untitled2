package month1;

import java.util.Random;
import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args){
        Random r = new Random();
        int N = 2, M = 3;
        int [][]array = new int[2][3];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                array[i][j] = r.nextInt((9)+1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                sum = sum + array[i][j];
                count++;
            }
        }
            count = sum / count;
                System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифмитическое: " + count);
    }
}

class B10_1{
      public static void main(String[] args){
          printNumbers(10, 10);
      }

      public static void printNumbers(int x, int y){
          for (int i = 1; i <= x; i++){
              for (int j = 1; j <= y; j++){
                  System.out.println(i + " * " + j + " = " + (i * j));
              }
              System.out.println();
          }
      }
}

class C10_1{
    public static void main(String[] args){
        printNumber(10, 10);
    }
    public static void printNumber(int x, int y){
        if (x < y){
            System.out.println(x);
        }else  if (x == y) System.out.println("Error");
        else System.out.println(y);
    }
}

class D10_1{
    public static void main(String[] args){
        double x  = printStepen(7);
        System.out.println(x);
    }
    private static double printStepen(int x) {
        return Math.pow(x, 4);
    }
}

class E10_1{
    public static void main(String[] args){
        int sum = num(4, 5, 7);
        System.out.println(sum);
    }
    public static int num(int a, int b, int c){
    int sum = a + b + c;
    return sum;
    }
}

class F10_1{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num = sum(num1);
        if (num > 10) {
            System.out.println("Больше 10");
        }

    }
    public static int sum(int num1){
        int sum = 0;
        for (int i = 0; i <= num1; i++){
            sum += i;
        }
        return sum;
    }
}