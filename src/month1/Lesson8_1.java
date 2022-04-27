package month1;

import java.util.Random;

public class Lesson8_1 {
    public static void main(String[] args){
        Random  random = new Random();
        int A = 10;
        int[] N = new int[A];
        for(int i = 0; i < A; i++){
            N [i] = random.nextInt(11);
        }
    }
}

class B8_1{
    public static void main(String[] args){
        int A = 20;
        int[] N = new int[A];
        Random r = new Random();
        for (int i = 0; i < 20; i++){
            N[i] = r.nextInt((220 - 170)+ 1) + 170;
        }

        int count = 0;
        int sum = 0;
        for(int i = 0; i < 20; i++){
            if(N[i] > 180 && N[i] < 190)
                sum += N[i];{
                count++;
            }
        }
        System.out.println(count);
        System.out.println(sum / count);
    }
}

class C8_1{
    public static void main(String[] args){
        int A = 20;
        int sumLess = 0;
        int sumGr = 0;
        int countLess = 0;
        int countGr = 0;
        int[] N = new int[A];
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            N [i] = r.nextInt(101);
            if (N[i] < 50) {
               sumLess += N[i];
               countLess++;
            }
            else {
                sumGr += N[i];
                countGr++;
            }
        }
        System.out.println("Less = " + (float)(sumLess / countLess));
        System.out.println("Greater = " + (float)sumLess / countLess);

    }
}
