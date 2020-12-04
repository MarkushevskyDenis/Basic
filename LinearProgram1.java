package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
 */

public class LinearProgram1 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double z;


        a = in("введите а");
        b = in("введите b");
        c = in("введите c");

        z = ((a - 3) * b / 2) + c;
        System.out.println(z);

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
