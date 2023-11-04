package laba3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        if (size > 0) {
            int[] massiv = new int[size];
            for (int i = 0; i < size; i++) {
                massiv[i] = random.nextInt(100);
                System.out.println("Массив примет вид: " + massiv[i]);
            }
            Arrays.sort(massiv);
            int min = massiv[0];
            int min_index = 0;
            System.out.println("Минимальное значение данного массива: " + min);
            System.out.println("Индекс минимального значениия массива " + min_index);
        }
    }
}





