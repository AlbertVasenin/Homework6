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
        task10();
        task11();
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
        for (int year=1904; year<=2094; year++) {
            if(year%400==0 && year%100==0 || year%4==0){
            System.out.println(year + " год является високосным");
            }
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
        for (int i = 1; i <= 12; i++) {
           int y = i * 29_000;
            System.out.println("Месяц "+ i +" сумма накоплений равна " + y  + " рублей");
        }
        System.out.println();
    }
    public static void task9() {
        // Перепишите решение задачи выше при условии, что деньги вы откладывать будете не “в банку”,
        // а в банк под проценты – 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате
        // “Месяц …, сумма накоплений равна … рублей”
        double BankTotal = 0;
        double putOnBank = 29_000;
        for (int i = 1; i <= 12; i++) {
            BankTotal = (BankTotal + putOnBank) * 1.01;
            System.out.println("Месяц "+ i +" сумма накоплений равна " + Math.round(BankTotal)  + " рублей");
        }
        System.out.println();
    }
        // Далее идут задачи повышенной сложности
    public static void task10() {
        //Это задание очень любят давать на собеседованиях в разных вариациях, потому мы предлагаем его вам,
        //чтобы вы оценили свои силы.
        //Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без остатка,
        //вывести ping, а если число делится на 5 без остатка, вывести pong.
        //Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
        //Допускается наличие пустых строк в выводе.
        for (int i = 1; i <= 30; i++) {
            int y = i;
            if(y%3==0 & y%5==0) {
                System.out.println(y + " ping pong");
            } else if(y%5==0) {
                System.out.println(y + " pong");
            } else if (y%3==0) {
                System.out.println(y + " ping");
            } else {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void task11() {
        //Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
        //Каждое следующее число равняется сумме двух предыдущих.
        //Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
        //Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
        //Должно получиться следующее:
        //0 1 1 2 3 5 8 13 21 34
        int y = 1;
        for (int i = 0; i < 500; i= y + i) {
            System.out.print(" " + i);
            y = i + y;
            System.out.print(" " + y);
        }
        System.out.println();
    }
}
