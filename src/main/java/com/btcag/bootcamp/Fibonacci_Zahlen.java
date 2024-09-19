package com.btcag.bootcamp;

import java.util.Scanner;

public class Fibonacci_Zahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib bitte eine Zahl für die Berechnung der Fibonacci-Zahlen ein:");
        long limit = scanner.nextLong();

        int fibo=0;
        int resultfibo = 0;
        int e = 1;
        int i = 1;

        while (limit > 0)
        {
            while (resultfibo < limit)
            {
                resultfibo = e + i;
                e = i;
                i = fibo;
                System.out.println(resultfibo+ " ");
                e++;
            }
        }
    }
}
