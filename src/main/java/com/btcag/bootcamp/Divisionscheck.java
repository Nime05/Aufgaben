package com.btcag.bootcamp;
import java.util.Scanner;

public class Divisionscheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcher Divisor soll überprüft werden?");
        long Divisor = scanner.nextLong();
        System.out.println("Bis zu welcher Zahl?");
        long Limit = scanner.nextLong();

        int i=0;
        long resultDiv = 0;


        while(resultDiv < Limit) {
            System.out.println(resultDiv + " ");
            i++;
            resultDiv = Divisor * i;
        }
    }
}
