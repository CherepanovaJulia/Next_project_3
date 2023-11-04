package laba3;

import java.util.Scanner;

public class ex3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите  количество чисел из последовательности Фибоначчи: ");
        int x = in.nextInt();

        int i = x;
        int a = 1;
        int b = 1;
        int c = 2;
        while (i > 0) {
            System.out.println("Последовательность Фибоначчи: " + a);
            c = a + b;
            a = b;
            b = c;
            i -- ;
        }
    }
}
