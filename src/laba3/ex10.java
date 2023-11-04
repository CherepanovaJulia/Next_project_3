

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ex10 {
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

            for (int i = 0; i < massiv.length; i++) {
                System.out.println("по возрастанию [" + i + "] = " + massiv[i]);

            }
        }
    }
}




