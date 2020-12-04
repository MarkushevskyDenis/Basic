package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Cycle8 {
    public static void main(String[] args) {
        int num;
        int num1;

        do {
            num = in("введите первое число");
        } while (num < 0);
        do {
            num1 = in("введите второе число");
        } while (num1 < 0);

        getDigit(num);
        getDigit(num1);
    }

    static void getDigit(int num) {
        int i = 0;
        int n = 0;

        do {
            i++;
        } while (num / (int) Math.pow(10, i) != 0);

        for (; i > 0; i--) {

            num = num - n * (int) Math.pow(10, i);
            int b = (int) Math.pow(10, i - 1);
            n = num / b;

            System.out.println(n);

        }

        System.out.println();

    }

    static int in(String str) {

        Scanner read = new Scanner(System.in);

        System.out.println(str);
        while (!read.hasNextInt()) {
            System.out.println("ошибка ввода");
            read.next();
        }

        return read.nextInt();
    }

}
