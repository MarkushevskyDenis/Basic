package by.jonline.grow.basic;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле(все переменные принимают действительные значения):
 *
 * 𝑏+ √(𝑏^2+4ac)
 * ------------- -ca^3+b^-2
 *      2a
 */

public class LinearProgram2 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double ans;

        a = in("введите а");
        b = in("введите b");
        c = in("введите c");


        ans = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a);
        ans -= a * a * a * c;
        ans += 1 / (b * b);

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
