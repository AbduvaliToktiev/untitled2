package month1;

import java.util.Scanner;

public class Praktik8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = askAndReturn("What' s your name?  ", sc);
        tell(("Hello, " + name));
        String country = askAndReturn("Where are you from?", sc);
        tell((country + "is an amazing country"));
    }

    private static void tell(String s) {
        System.out.println(s);
    }

    private static String askAndReturn(String question, Scanner sc) {
        System.out.println(question);
        return sc.nextLine();
    }
}

class Praktik8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       metod(sc);
        System.out.println("finish");
    }
    static void metod(Scanner sc){
        System.out.println("NUM: ");
        int a = sc.nextInt();
        if(a != 0){
            metod(sc);
        }
    }
}

