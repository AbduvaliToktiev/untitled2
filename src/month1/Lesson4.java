package month1;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args){
       short a = 12;
       short b = 5;
       short M;
        if (a > b) {
            System.out.println(b);

        } else  if(a == b){
            System.out.println();
        }
        else {
            System.out.println(a);
        }

    }
}

class X{
    public static void main(String[] args) {
        byte a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextByte();
        b = sc.nextByte();
        c = sc.nextByte();
         if (a >= b && a > c) {
                System.out.println(a);
            }
        else if (b > a && b >= c) {
             System.out.println(b);
         }
        else if (a == b && c == b) {
              System.out.println("Они равны");
         }
        else {
             System.out.println(c);
         }
    }
}
