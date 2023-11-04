package laba3;
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Напишите название дня недели с заглавной буквы: ");

        String day = in.nextLine();
        int dayx = 0;

        if (day.equals("Понедельник")) {
            dayx = 1;
        } else if (day.equals("Вторник")) {
            dayx = 2;
        } else if (day.equals("Среда")) {
            dayx = 3;
        } else if (day.equals("Четверг")) {
            dayx = 4;
        } else if (day.equals("Пятница")) {
            dayx = 5;
        } else if (day.equals("Суббота")) {
            dayx = 6;
        } else if (day.equals("Воскресенье")) {
            dayx = 7;
        } else {
            System.out.println("Такого дня недели не существует: " + day);
        }
        if (dayx != 0) {
            System.out.printf("%s - %s день недели\n", day, dayx);
        }

    }
}




