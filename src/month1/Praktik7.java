package month1;

import java.util.Arrays;
import java.util.Scanner;

public class Praktik7 {
    public static void main(String[] args){
        int max = 185;
        int count = 0;
        for(int i21 = 0; i21 <= max/21; i21++){
            for (int i17 = 0; i17 <= max/17; i17++){
                for (int i15 = 0; i15 <= max/15; i15++){
                    if((i21 * 21 + i17 * 17 + i15 * 15) == max){
                        count++;
                        System.out.println(String.format("%s)%s * 21 + %s * 17 + %s * 15 == %s", count, i21, i17, i15, max));
                        System.out.println(count);
                    }
                }
            }
        }
    }
}

class Praktik7_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Введите число от 0 до 15: ");
        int Fibon = sc.nextInt();
        int[] fib = new int[Fibon];
        for(int i = 0; i < fib.length; i++) {
            if (i == 0) {
                fib[i] = 1;
            } else if (i == 1) {
                fib[i] = 1;
            } else {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        System.out.println(Arrays.toString(fib));
    }
}
