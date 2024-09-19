package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCII_kunst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Möchtest du ein Rechteck (1) oder ein Dreieck (2) erzeugen?");
        long auswahl = scanner.nextLong();

        if (auswahl == 1) {
            System.out.println("Gib bitte die größe des Rechtecks an:");
            long size = scanner.nextLong();

            int i = 1;
            String z = "*";

            while (i <= size) {
                int zeile = 1;
                while (zeile <= size) {
                    System.out.print(z);
                    zeile++;
                }
                System.out.println(" ");
                i++;
            }
        }
        else if (auswahl == 2) {
            System.out.println("Gib bitte die größe des Dreiecks an:");
            int lines = scanner.nextInt();


            int i = 0;
            int sterne = 1;
            String z = "*";

            while (i < lines) {

                int b = 0;
                while (b < sterne) {
                    System.out.print(z);
                    b++;
                }
                System.out.println(" ");
                sterne++;
                i++;
            }

        }
    }
}
