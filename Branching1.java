package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
 * он прямоугольным.
 */

public class Branching1 {
    public static void main(String[] args) {

        int angle1;
        int angle2;

        angle1 = in("введите угол");
        angle2 = in("введите угол");


        if (angle1 + angle2 < 180) {

            System.out.println("треугольник существует");

            if (angle2 == 90 || angle1 == 90 || angle1 + angle2 == 90) {

                System.out.println("треугольник прямоугольный");

            }
        } else {

            System.out.println("треугольник не существует");

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
