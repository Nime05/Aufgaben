package com.btcag.bootcamp;


import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Zahlen eingeben:");
        long input = scanner.nextLong();

        int quersumme = 0;

        while (input > 0){
           quersumme += input % 10;
           input /= 10;

        }
        System.out.println("Die Quersumme ist: "+ quersumme);
    }
}
