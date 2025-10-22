package org.example;

import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static ArrayList<String> aufgaben = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        boolean schalter = true;
        while (schalter) {



            anzeigeMenu();
            int eingabe = scanner.nextInt();

            if (eingabe == 1) {
                scanner.nextLine();
                System.out.println("Gib eine Aufgabe ein:");
                String aufgabe = scanner.nextLine();
                aufgabeHinzufuegen(aufgabe);
            } else if (eingabe == 2) {

                allesAnzeigen();
            } else if (eingabe == 3) {
                System.out.println("Welche Aufgaben willst du bearbeiten?");
                int eingaben = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Was sollte die neue Aufgabe sein?");
                String neueAufgabe = scanner.nextLine();
                aufgabeBearbeiten(eingaben, neueAufgabe);
            } else if (eingabe == 4) {
                System.out.println("Welche Aufgabe willst du löschen?");
                int eingabene = scanner.nextInt();
                aufgabeLoeschen(eingabene);
            } else if (eingabe == 5) {
                programmBeenden();
            }

        }


    }

    public static void aufgabeHinzufuegen(String aufgabe) {

        aufgaben.add(aufgabe);

    }

    public static void allesAnzeigen() {
        if (aufgaben.isEmpty()) {
            System.out.println("Du hast keine Aufgaben in der Liste");
        } else {
            System.out.println("Deine Aufgaben:");
            for (int i = 0; i < aufgaben.size(); i++) {
                System.out.println(aufgaben.get(i));
            }
        }
    }

    public static void aufgabeBearbeiten(int eingabe, String neueAufgabe) {
        System.out.println(aufgaben);
        aufgaben.set(eingabe - 1, neueAufgabe);
    }

    public static void aufgabeLoeschen(int eingabene) {

        System.out.println(aufgaben);

        aufgaben.remove(eingabene - 1);

    }

    public static void programmBeenden() {
        boolean schalter = false;
        System.out.println("Programm beenden...");
        System.exit(0);
    }
    public static void anzeigeMenu(){
        System.out.println("1: " + "Aufgabe hinzufügen");
        System.out.println("2: " + "Alle Aufgaben anzeigen");
        System.out.println("3: " + "Aufgabe bearbeiten");
        System.out.println("4: " + "Aufgabe löschen");
        System.out.println("5: " + "Programm beenden");
    }
}