package month1;

import java.util.Random;
import java.util.Scanner;

public class Ekzamen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Внесите сумму которую хотите снять: ");
        int summa = sc.nextInt();
        System.out.println("Ваша сумма: " + summa);
        int min = 60001;
        int max = 2147483647;
        int lim = r.nextInt((max - min) + 1) + min;
        if (summa < lim) {
            System.out.println("Сумма недоступна для снятия");
        }
            int count = 0;
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= 2; k++) {
                for (int a = 0; a <= 1; a++) {
                    for (int b = 0; b <= 50; b++) {
                        for (int c = 0; c <= 20; c++) {
                            if ((i * 5000) + (k * 2000) + (a * 1000) + (b * 500) + (c * 200) == summa) {
                                System.out.println("5000 = " + i + "(шт) " + " 2000 = " + k + "(шт) " + " 1000 = " + a + "(шт) " + " 500 = " + b + "(шт) " + " 200 = "  + c + "(шт)");
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Количество вариантов: " + count);
    }
}

