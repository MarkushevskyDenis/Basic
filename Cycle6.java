package by.jonline.grow.basic;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Cycle6 {

    public static void main(String[] args) {

        for (int i = 0; i < 65536; i++) {

            System.out.print(i + "-" + (char) i + ";");

            if (i % 19 == 0 && i != 0) {

                System.out.print("\n");

            }

        }

    }

}
