package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 *   x, x>2
 * y=
 *   -x, x<=2
 */

public class Cycle2 {
    public static void main(String[] args) {

        int a;
        int b;
        int h;

        a = in("введите начало отрезка");

        do {
            b = in("введите конец отрезка");
        } while (b < a);

        do {
            h = in("введите шаг");
        } while (h <= 0);

        for (int x = a; x <= b; x += h) {

            if (x > 2) {

                System.out.print(x + " ");

            } else {

                System.out.print(-x + " ");

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
