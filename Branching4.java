package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
 * отверстие.
 */

public class Branching4 {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int x;
        int y;
        int z;

        x = in("введите х");
        y = in("введите y");
        z = in("введите z");


        if ((z <= b && x <= a) || (z <= a && x <= b)) {
            System.out.println(true + " zx");
        } else {
            System.out.println(false + " zx");
        }

        if ((z <= b && y <= a) || (z <= a && y <= b)) {
            System.out.println(true + " zy");
        } else {
            System.out.println(false + " zy");
        }

        if ((y <= b && x <= a) || (y <= a && x <= b)) {
            System.out.println(true + " yx");
        } else {
            System.out.println(false + " yx");
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
