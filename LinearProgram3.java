package by.jonline.grow.basic;

import java.util.Scanner;

/**
 *  Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *  𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦
 *  -----------∗ 𝑡𝑔 𝑥y
 * 𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦
 */

public class LinearProgram3 {
    public static void main(String[] args) {

        double x;
        double y;

        x=in("введите х");
        y=in("введите у");

        double ans = Math.tan(x * y) * (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y));
        System.out.println(ans);

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
