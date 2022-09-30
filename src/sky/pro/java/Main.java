package sky.pro.java;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task1() {
        // С помощью цикла for выведите в консоль все числа от 1 до 10
      for (int i = 1; i < 11; i++) {
          System.out.print(" " + i);
      }
        System.out.println();
    }

    public static void task2() {
        // С помощью цикла for выведите в консоль все числа от 10 до 1
        for (int i = 10; i > 0; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task3() {
        // Выведите в консоль все четные числа от 0 до 17
        for (int i = 0; i <= 17; i+=2) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task4() {
        // Выведите в консоль все числа от 10 до - 10 от большего числа к меньшему
        for (int i = 10; i >= -10; i-=1) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task5() {
        // Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        // В консоль результат должен выводиться в формате “… год является високосным”
        for (int year=1904; year<=2094; year+=4) {
            System.out.println(year + " год является високосным");
        }
        System.out.println();
    }

    public static void task6() {
        // Напишите программу, которая выводит в консоль последовательность цифр:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for(int i = 7; i <= 98; i+=7) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task7() {
        // Напишите программу, которая выводит в консоль последовательность цифр:
        //1 2 4 8 16 32 64 128 256 512
        for(int i = 1; i <= 512; i*=2) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
    public static void task8() {
        // Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать
        // по 29 000 рублей “в банку”.
        //Выведите сумму накоплений за каждый месяц в консоль в формате “Месяц … , сумма накоплений равна … рублей”
        for (int i = 1; i <= 12; i+=1) {
           int y = i * 29_000;
            System.out.println("Месяц "+ i +" сумма накоплений равна " + y  + " рублей");
        }
        System.out.println();
    }
    public static void task9() {
        // Перепишите решение задачи выше при условии, что деньги вы откладывать будете не “в банку”,
        // а в банк под проценты – 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате
        // “Месяц …, сумма накоплений равна … рублей”
        for (int i = 1; i <= 12; i+=1) {
            double y = i * 29_000 * 1.01;
            System.out.println("Месяц "+ i +" сумма накоплений равна " + y  + " рублей");
        }
        System.out.println();
    }
}
