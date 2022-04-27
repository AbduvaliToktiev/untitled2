package month1;

import java.util.Random;
import java.util.Scanner;

public class Lesson9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = random.nextInt(6);
        }
        System.out.println("Что ищем?");
        int x = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] == x) {
                count++;
                if (count == 1) {
                    System.out.print("Нашли ");
                }
                System.out.print("numbers[" + i + "] = " + x + ", ");
            }
        }
        if (count == 0) {
            System.out.println("Не нашли!");
        }
    }
}

class B9_1{
    public static void main(String[] args){
        int count = 0;
       for (int i = 2; i <=1000; i++){
           for (int j = 2; j <= i; j++) {
               if (i % j == 0) {
                   count++;
               }
           }
           if (count <= 1) {
               System.out.println(i + ", ");
           }
               count = 0;
       }
    }
}

class C9_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a < 1 || b < 0 || a > b)){
            System.out.println("Error");
        }
        else {
            int count = 0;
            for (int i = a; i <= b; i++) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count <= 1) {
                    System.out.print(i + ", ");
                }
                count = 0;
            }
        }
    }
}

class D9_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for( int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        int max = num[0];
        int count = 0;

        for (int i = 0; i < 5; i++){
            if (max < num[i]) {
                max = num[i];
                count++;
            }
        }
        System.out.println("Max numbers " + max);
        System.out.println("Counter " + count);
    }
}