package laba3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Я покажу тебе последовательность Фибоначчи " +
                "Напиши любое число ");
        int x = in.nextInt();
        System.out.println("Вы хотите посмотреть последовательность из " + " "
                    + x +  " " + "чисел");

        int [] limit= new int [x];
        limit [0] = 0;
        limit [1] = 1;
        for (int i = 2 ; i <= limit.length; ++i) {
            limit [i] = limit [i - 1] + limit [i - 2];
            System.out.println("Последовательность принимает вид: " + (limit[i]));
            }
        }
    }



