package laba3;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, ограничивающее количество выводимых значений: ");
        int massiv_size = in.nextInt();
        if (massiv_size > 0) {
            System.out.println("Размер массива равен " + massiv_size);
            int massiv[] = new int[massiv_size];
            int x = 0;
            int y = 0;
            while (x < massiv_size) {
                y++;
                if (y % 5 == 2) {
                    massiv[x] = y;
                    System.out.println("Элемент массива [" + x + "]= " + massiv[x]);
                    x++;
                }
            }
        } else {
            System.out.println("Что-то не так");
        }
    }
}
