package laba3;

import java.util.Scanner;
//import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите название дня недели с заглавной буквы: ");
        String day = in.nextLine();
        System.out.println("Ваш  день недели: " + day);

          switch (day) {
            case "Понедельник":
                System.out.println("Порядковый номер дня недели -1");
                break;
            case "Вторник":
                System.out.println("Порядковый номер дня недели - 2");
                break;
            case "Среда":
                System.out.println("Порядковый номер дня недели - 3");
                break;
            case "Четверг":
                System.out.println("Порядковый номер дня недели - 4");
                break;
            case "Пятница":
                System.out.println("Порядковый номер дня недели - 5");
                break;
            case "Суббота":
                System.out.println("Порядковый номер дня недели - 6");
                break;
            case "Воскресенье":
                System.out.println("Порядковый номер дня недели - 7");
                break;
            default:
                System.out.println("Проверьте введенные Вами данные");
        }

    }
}


