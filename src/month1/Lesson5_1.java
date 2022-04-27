package month1;

import java.util.Scanner;

public class Lesson5_1 {
    public static void main(String[] args) {
        int m = 0;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        switch (m) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Ошибка");

        }
    }
}

 class Som200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int age2 = age % 10;
        boolean age3 = (age % 100 >= 11) && (age % 100 <= 14);
        String old = "";

        if(age<=0 || age>120){
            System.out.println("Возраст введён не верно");
        }
        else if (age2 == 1)
            old = "год";
        else if(age2 == 0 || age2 >= 5 && age2 <= 9)
            old = "лет";
        else if(age2 >= 2 && age2 <= 4)
            old = "года";
        if (age3)
            old = "лет";

        System.out.println(age+" "+old);
    }
}




