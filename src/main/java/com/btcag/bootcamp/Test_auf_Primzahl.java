package com.btcag.bootcamp;
import java.util.Scanner;
public class Test_auf_Primzahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Ganz Zahl zur Berechnung der Primzahl ein:");
        Long input = scanner.nextLong();

        int teiler = 2;



        while (teiler < input) {
            while (input % teiler == 0){
                System.out.println(input+ " ist keine Primzahl.");
                return;
            }

            teiler += 1;
        }
        System.out.println(input + " ist eine Primzahl.");
    }
}
