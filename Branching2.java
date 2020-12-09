package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Найти max{min(a, b), min(c, d)}
 */

public class Branching2 {
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;

        int minAB;
        int minCD;
        int max;

        a = in("введите a");
        b = in("введите b");
        c = in("введите c");
        d = in("введите d");

        minAB = a;
        if (a > b) {
            minAB = b;
        }

        minCD = c;
        if (c > d) {
            minCD = d;
        }

        max = minAB;
        if (minCD > minAB) {
            max = minCD;
        }

        System.out.println(max);

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
