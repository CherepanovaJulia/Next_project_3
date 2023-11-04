package laba3;

import java.util.Scanner;
import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество слагаемых: ");
        int sum = in.nextInt();
        for (int i = 0; i < 500; i++) {
            System.out.println(Math.random());
            int x = 0;
            if (x % 5 == 2 || x % 3 == 1) {
                System.out.println("Слагаемые, удовлетворяющие условиям: " + x);
                sum = x + sum;
            }
        }
    }
}




           // System.out.println("не могу посчитать: ");



