package laba3;
import java.util.Scanner;

public class ex4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите последовательно два целых числа через пробел : ");
        int x = in.nextInt();
        int y = in.nextInt();

        while (x <= y) {
            System.out.println("ряд целых чисел" + " " + x++);
        }
    }
}
