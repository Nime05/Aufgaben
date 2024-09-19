package com.btcag.bootcamp;
import java.sql.SQLOutput;
import java.util.Scanner;
import javax.sound.sampled.Line;
import javax.swing.*;

public class rückwärts_Ausgeben {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Zahlen eingeben:");
        String inputString = scanner.nextLine();



        String resultString = "";
        int i=0;

        while (i<inputString.length() ) {

            resultString = inputString.charAt(i) + resultString;
            i++;
        }
        System.out.println(resultString);

    }
}
