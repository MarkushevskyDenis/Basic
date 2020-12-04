package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Вычислить значение функции:
 *
 *      x^2-3x+9, если x<=3
 * F(x)=
 *      1 / (x * x * x + 6), если x>3
 */

public class Branching5 {
    public static void main(String[] args) {

        double x;

        x = in("введите х");

        if (x <= 3) {

            System.out.println(x * x - 3 * x + 9);

        } else {

            System.out.println(1 / (x * x * x + 6));

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
