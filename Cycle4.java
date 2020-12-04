package by.jonline.grow.basic;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Cycle4 {

    public static void main(String[] args) {

        int pr = 1;
        int check = 1;

        for (int i = 1; i < 200; i++) {

            pr *= i * i;

            if (check > pr) {
                System.out.println("переполнение\nпоследнее произведение = " + check + " при i = " + (i - 1));
                return;
            }

            check = pr;

        }

        System.out.println(pr);

    }

}
