package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 * данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc
 */

public class LinearProgram5 {
    public static void main(String[] args) {

        int h;
        int m;
        int s;
        int t;

        t = in("введите секунды");

        h = t / 3600;
        m = (t - 3600 * h) / 60;
        s = t - 3600 * h - 60 * m;

        System.out.println(h / 10 + "" + (h - (h / 10) * 10) + "ч");
        System.out.println(m / 10 + "" + (m - (m / 10) * 10) + "м");
        System.out.println(s / 10 + "" + (s - (s / 10) * 10) + "с");

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
