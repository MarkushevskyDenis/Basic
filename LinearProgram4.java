package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
 * дробную и целую части числа и вывести полученное значение числа.
 */

public class LinearProgram4 {
    public static void main(String[] args) {

        double num;
        int fraction;
        int integer;

        num = in("введите число nnn.ddd");

        integer = (int) num;
        fraction = (int) (num * 1000 - integer * 1000);
        num = (fraction * 1000 + integer) / 1000.0;

        System.out.println(num);
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
