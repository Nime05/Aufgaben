package com.btcag.bootcamp;
import com.sun.source.tree.CaseTree;

import java.util.Scanner;
public class Geometrie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Möchtest du einen Kreis oder einen Kreis (1) oder ein Rechteck (2) berechnen?");
        Long Auswahl = scanner.nextLong();
        if (Auswahl == 1)
        {
            System.out.println("Bitte gib den Radius ein, um die Flächenberechnung des Kreises durchzuführen:");
            int r = scanner.nextInt();

            double A = (r * r) * 3.14;

            System.out.println(A + " ist der Flächeninhalt des Kreises.");
        }
        else
        {
            System.out.println("Bitte gib die Seitenlängen ein, um die Flächenberechnung des Rechtecks durchzuführen:");
            int s1 = scanner.nextInt();
            int s2 = scanner.nextInt();

            double A = s1*s2;

            System.out.println(A + " ist der Flächeninhalt des Rechtecks.");
        }
    }

}

