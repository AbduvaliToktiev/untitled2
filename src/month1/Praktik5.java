package month1;

import java.util.Scanner;

public class Praktik5 {
    public static void main(String[] args) {

        boolean exit = true;
        while (exit) {
            Scanner sc = new Scanner(System.in);
            System.out.println("num 1:");
            double num1 = sc.nextDouble();
            sc.nextLine();

            String action = "";

            System.out.println("action: ");


            boolean actionBoolean = true;
            while (actionBoolean) {
                System.out.println("action: ");
                action = sc.nextLine();
                if (!action.equals("+") || !action.equals("-") || !action.equals("/") || !action.equals("*")) {
                    actionBoolean = false;
                } else {
                    System.out.println("Sorry, i dont know this symbol");

                }
            }

            System.out.println("num 2: ");
            double num2 = sc.nextDouble();
            sc.nextLine();

            double result = 0.0;

            switch (action) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 + num2;
                    break;
                case "/":
                    result = num1 + num2;
                    break;
                case "*":
                    result = num1 + num2;
                    break;
                default:
                    System.out.println("Sorry");

            }

            System.out.println(num1 + " " + action + " " + num2 + " =" + result);

            System.out.println("If you want exit write exit, if not any symbol");
            String e = sc.nextLine();

            if (e.equals("exit")){
                exit = false;
            }
        }
    }
}
