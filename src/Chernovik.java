import java.util.Random;
import java.util.Scanner;

public class Chernovik {
    public static void main(String[] args){
       int i;
       for (i = 1; i <= 10; i++){
           System.out.println("3 * " + i + " = " + 3*i);
       }
    }
}

// Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.
class Chernovik1 {
    public static void main(String[] args){
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
            System.out.println(sum);
    }
}

//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
// а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
class Chernovik2 {
    public static void main(String[] args){
        System.out.println("Введите число 1, 2 или 3");
        Scanner sc = new Scanner(System.in);
        int chislo = sc.nextInt();
        if (chislo == 1){
            System.out.println("Вы ввели число: 1");
        }
        else if (chislo == 2){
            System.out.println("Вы ввели число: 2");
        }
        else if (chislo == 3){
            System.out.println("Вы ввели число: 3");
        }
        else
            System.out.println("Вы ввели число не равное 1, 2 или 3");
    }
}

class Chernovik3 {
    public static void main(String[] args){
        System.out.println("Введите число: 1");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1){
            System.out.println("Вы ввели число: 1");
        }
    }
}

class Chernovik4 {
    public static void main(String[] args){
        int n = 10;
        for(int i = 0, j = n - 1; i < j; i++, j--){

            System.out.println(i * j);
        }
    }
}

class Chernovik5 {
    public static void main(String[] args) {
                String str = "ABC";
                char[] result = str.toCharArray();

                System.out.println("Char array:");
                for (int i = 0; i < result.length; i++)
                    System.out.println("Element [" + i + "]: " + result[i]);
    }
}

//  Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
class Chernovik6 {
    public static void main(String[] args) {
        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
            avg += array[i]/array.length;
        }

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + avg);
    }
}

//Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
// Не используйте дополнительный массив для хранения результатов.
class Chernovik7 {
    public static void main(String[] args) {
        String[] capitalCities = {"Moscow ", " Bishkek ", " Tashkent ", " Minsk ", " Nur-Sultan ", " Dushanbe "};
        //Выводим изначальный массив в консоль
        for (int i = 0; i < capitalCities.length; i++) {
            System.out.print(capitalCities[i]);
        }
            System.out.println();

            int n = capitalCities.length;
            //Переменная, которая будет использоваться при обмене элементов
            String temp;

            for (int i = 0; i < n/2; i++) {
                temp = capitalCities[n-i-1];
                capitalCities[n-i-1] = capitalCities[i];
                capitalCities[i] = temp;
            }
            //Выводим конечный массив в консоль
            for (int i = 0; i < capitalCities.length; i++) {
                System.out.print(capitalCities[i]);
        }
    }
}

//Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер.
//Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n  игроков (по 5 карт каждому) из рассортированной колоды.
//Разделяйте пять карт, выданных каждому игроку, пустой строкой.
class Deal {
        public static void main(String[] args) {
            // часть 1 - инициализация переменных
            int cardsPerPlayer = 5;
            int players = 0;
            String[] suits = {
                    "Пики", "Буби", "Черви", "Крести"
            };
            String[] rank = {
                    "2", "3", "4", "5", "6", "7", "8", "9", "10",
                    "Валет", "Дама", "Король", "Туз"
            };
            int n = suits.length * rank.length; // количество карт
            // часть 2 - ввод с консоли
            for (; ; ) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Введите количество игроков: ");
                if (sc.hasNextInt()) {
                    players = sc.nextInt();
                    if (cardsPerPlayer * players <= n) {
                        break;
                    } else {
                        if (players == 0) {

                            System.out.println("Игра прекращена.");
                            break;

                        } else if (players < 0) {

                            System.out.println("Число игроков не может быть меньше 0");

                        } else {

                            System.out.println("Слишком много игроков!");
                        }
                    }
                } else {
                    System.out.println("Вы ввели не число, или Ваше число слишком большое!");

                }
            }
            // часть 3 - инициализация колоды
            String[] deck = new String[n];
            for (int i = 0; i < rank.length; i++) {
                for (int j = 0; j < suits.length; j++) {
                    deck[suits.length * i + j] = rank[i] + " " + suits[j];
                }
            }
            // часть 4 - перетасовка колоды
            for (int i = 0; i < n; i++) {
                int r = i + (int) (Math.random() * (n - i)); // случайная карта в колоде
                String temp = deck[r];
                deck[r] = deck[i];
                deck[i] = temp;
            }
            // часть 5 - перетасованная колода выводится на экран
            for (int i = 0; i < players * cardsPerPlayer; i++) {
                System.out.println(deck[i]);
                if (i % cardsPerPlayer == cardsPerPlayer - 1)
                    System.out.println();
                }
            }
        }

class HowMany {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Вводим предложение в консоль
        System.out.print("Введите слова через пробел: ");
        String words = sc.nextLine();
        //Начальное количество слов равно 0
        int count = 0;

        //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
        if(words.length() != 0){
            count++;
            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < words.length(); i++) {
                if(words.charAt(i) == ' '){
                    //Если пробел - увеличиваем количество слов на 1
                    count++;
                }
            }
        }
        System.out.println("Вы ввели " + count  + " слов");
    }
}

//Напишите программу Transpose.java, которая будет транспонировать заданную квадратную матрицу без использования дополнительного массива.
//Напоминаем, что такое транспонирование матрицы.
//Транспонированная матрица - это матрица, полученная из исходной матрицы путем замены строк на столбцы.
//Ниже приводим 2 примера транспонированной матрицы.
class Transpose {
    public static void main(String[] args) {
        // часть 1 - создаем матрицу n на n
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для создания квадратной матрицы: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n * i + j;
            }
        }

        // часть 2 - выводит на экран начальную матрицу
        System.out.println("Начальная матрица");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

        // часть 3 - транспонирование матрицы
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // часть 4 - выводит на экран транспонированную матрицу
        System.out.println();
        System.out.println("Новая матрица");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }
}

class MaxIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int nums = sc.nextInt();
        int [] mas = new int[nums];
        int maxNumber = -16;
        int maxIndex = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*31)-15;
        System.out.print(mas[i] + " ");
            if(maxNumber <= mas[i]){
                maxNumber = mas[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("Индекс максимального элемента: " + maxIndex);
    }
}