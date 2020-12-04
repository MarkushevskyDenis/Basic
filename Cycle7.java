package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */

public class Cycle7 {
    public static void main(String[] args) {

        int m;
        int n;

        do {

            m = in("введите начало промежутка");

        } while (m <= 0);
        do {

            n = in("введите конец промежутка");

        } while (n < m);

        for (int i = m; i <= n; i++) {

            System.out.println(i);

            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {

                    System.out.println("/" + j);

                }

            }
        }

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
