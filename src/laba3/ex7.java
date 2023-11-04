package laba3;

import java.util.Scanner;
import java.util.Arrays;

public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("массив: ");
        int size = 10;
        char [] symbols = new char [size];
        char n = symbols[0] = 's';
        for (int i = 0; i < size; n --) {
            if (n % 2 == 1){
                symbols[i] = n;
                System.out.println("Элемент массива ["+ i +"] = " + symbols [i]);
                i++;
            }
        }
            System.out.println("После сортировки");
         Arrays.sort(symbols);
         for (int i = 0; i <symbols.length; i++) {
             System.out.println("по возрастанию ["+ i +"] = " + symbols[i]);
        }
    }
}

