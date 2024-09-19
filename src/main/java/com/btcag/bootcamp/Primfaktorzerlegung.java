package com.btcag.bootcamp;

import java.util.Scanner;

public class Primfaktorzerlegung {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zahl für Primfaktorzerlegung eingeben:");
        long input = scanner.nextLong();

        long teiler = 2;



        while (input > 1) {
            while ( input % teiler == 0){
                System.out.println(teiler +" ");
                input /= teiler;
            }
        teiler += 1;
        }

    }
}
