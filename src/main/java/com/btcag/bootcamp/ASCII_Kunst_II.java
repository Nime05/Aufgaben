package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCII_Kunst_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Größe einer Sanduhr hälfte:");
        int lines = scanner.nextInt();


        int i = 0;
        int sterne = lines;
        int sterne2 = 1;
        String z = "*";






            while (i < lines) {

                int b = 0;
                while (b < sterne) {
                    System.out.print(z);
                    b++;
                }
                System.out.println(" ");
                sterne--;
                i++;
            }

            System.out.println(" ");
            int e = 0;

        while (e < lines) {
            int b = 0;
            while (b < sterne2) {

                System.out.print(z);
                b++;
            }
            System.out.println(" ");
            sterne2++;
            e++;
        }
    }
}
