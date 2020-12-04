package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид:
 * an = 1/2^n + 1/3^n
 */

public class Cycle5 {
    public static void main(String[] args) {

        double e;
        double sum = 0;
        double a;

        do {

            e = in("введите положительное число");

        } while (e <= 0);

        for (double i = 0; ; i++) {

            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);

            if (a >= e) {

                sum += a;

            } else {

                System.out.println(sum);
                return;

            }

        }
    }

    static double in(String str) {

        Scanner read = new Scanner(System.in);

        System.out.println(str);
        while (!read.hasNextDouble()) {
            System.out.println("ошибка ввода");
            read.next();
        }

        return read.nextDouble();
    }

}
