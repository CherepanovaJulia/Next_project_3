package laba3;
import java.util.Scanner;

public class ex3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел последовательности Фибоначчи: ");
        int x = in.nextInt();
        int a = 1;
        int b = 1;
        int c = 2;
        for(int i = x; i > 0; --i) {
            System.out.println("Последовательность Фибоначчи:" + a);
            a = b;
            b = c;
            c = a + b;
        }
    }
}
