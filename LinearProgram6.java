package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае:
 * □□□□□□□□□□□□□
 * □□□□□□□□□□□□□
 * □□□□■■■■■□□□□
 * □□□□■■■■■□□□□
 * □□□□■■■■■□□□□
 * □□□□■■■■■□□□□
 * □□■■■■■■■■■□□
 * □□■■■■□■■■■□□
 * □□■■■■■■■■■□□
 * □□■■■■■■■■■□□
 * □□□□□□□□□□□□□
 */

public class LinearProgram6 {
    public static void main(String[] args) {

        int x;
        int y;

        x =  in("введите х");
        y =  in("введите у");

        if ((y >= 0 && y <= 4) && (x >= -2 && x <= 2)) {

            System.out.print("true");

        } else if ((y <= 0 && y >= -3) && (x >= -4 && x <= 4)) {

            if (x == 0 && y == -1) {

                System.out.print("false");

            } else {

                System.out.print("true");

            }

        } else {

            System.out.print("false");

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
