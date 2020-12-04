package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Branching3 {
    public static void main(String[] args) {

        double x1;
        double x2;
        double x3;
        double y1;
        double y2;
        double y3;

        double x;
        double y;
        double k;
        double b;
        double e = 0.00000001;

        x1 = in("введите х1");
        x2 = in("введите х2");
        x3 = in("введите х3");

        y1 = in("введите y1");
        y2 = in("введите y2");
        y3 = in("введите y3");


        y = y2 - y1;
        x = x2 - x1;
        k = y / x;
        b = y2 - x2 * k;

        if (Math.abs((k * x3 + b) - y3) < e) {

            System.out.println(true);

        } else {

            System.out.println(false);

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

