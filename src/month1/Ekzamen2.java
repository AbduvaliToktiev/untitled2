package month1;

import java.util.Scanner;

public class Ekzamen2 {
    public static void main(String[] args) {
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 100; i < 201; i++) {
            if (i % 3 == 0) {
                sum3 = sum3 + i;
            } else if (i % 4 == 0){
                sum4 = sum4 + i;
            }
        }
                System.out.println("Сумма чисел кратных 3: " + sum3 + "\nСумма чисел кратных 4: " + sum4);
        System.out.println("Разница сумм: " + sum3 + " - " + sum4 + " = " + (sum3 - sum4));
    }
}

class Ekzamen3_1 {
    public static void main(String[] args) {
        char[] arr = {'р', 'а', 'б', 'о', 'т', 'а', 'н', 'е', 'в', 'о', 'л', 'к'};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int count1 = 0;
            for (int k = 0; k < arr.length; k++) {
               if (arr[i] == arr[k]){
                   count1++;
               }
            }
        }
        char[] result = new char[arr.length - count];
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            int count3 = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[i] == arr[k]) count3++;
                }
                if (count3 < 2) {
                    result[count2] = arr[i];
                    count2++;
            }
        }
        System.out.println(result);
    }
}

class Ekzamen4_1 {
    public static void main(String[] args) {
        System.out.print("Введите год рождения: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age % 4 == 0) {
            if (age % 100 == 0 || age % 400 == 0) {
                System.out.println("Год высокосный");
            } else {
                System.out.println("Год высокосный");
            }
        } else System.out.println("Год обычный");
        System.out.println("Ваш возраст: " + (2022 - age));
    }
}





