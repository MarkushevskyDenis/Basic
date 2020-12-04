package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 */

public class Cycle1 {

    public static void main(String[] args) {

            int num;
            int sum = 1;

            do {
                num = in("введите целое положительное число");
            } while (num <= 0);

            for (int i = 2; i <= num; i++) {
                sum += i;
            }

            System.out.println(sum);

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
