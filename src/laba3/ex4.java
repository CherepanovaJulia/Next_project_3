package laba3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа через пробел: ");
        int x = in.nextInt();
        int y = in.nextInt();

        do {
            System.out.println("Последовательность целых чисел: " + x++);
            }
        while(x <= y);
            }
        }












