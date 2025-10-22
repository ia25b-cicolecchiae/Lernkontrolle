package org.example;

import java.util.Scanner;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static ArrayList<String> aufgaben = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean schalter = true;
        while (schalter) {


            System.out.println("1: " + "Aufgabe hinzufügen" );
            System.out.println("2: " + "Alle Aufgaben anzeigen");
            System.out.println("3: " + "Aufgabe bearbeiten");
            System.out.println("4: " + "Aufgabe löschen");
            System.out.println("5: " + "Programm beenden");
            Scanner scanner = new Scanner(System.in);
            int eingabe = scanner.nextInt();

            if (eingabe == 1) {
                aufgabeHinzufuegen();
            }else if (eingabe == 2) {
                allesAnzeigen();
            }else if (eingabe == 3) {
                aufgabeBearbeiten();
            }else if (eingabe == 4) {
                aufgabeLoeschen();
            }else if (eingabe == 5) {
                programmBeenden();
            }

        }





    }
    public static void aufgabeHinzufuegen() {
        System.out.println("Gib die neue Aufgabe ein:");
        String aufgabe = scanner.nextLine();
        aufgaben.add(aufgabe);
       // System.out.println(aufgabe);
    }
    public static void allesAnzeigen() {
       if (aufgaben.isEmpty()) {
           System.out.println("Du hast keine Aufgaben in der Liste");
       } else  {
        System.out.println("Deine Aufgaben:");
        for (int i = 0; i < aufgaben.size(); i++) {
            System.out.println(aufgaben.get(i));
        }
       }
    }
    public static void aufgabeBearbeiten() {
        System.out.println(aufgaben);
        System.out.println("Welche Aufgaben willst du bearbeiten?");
        int eingabe = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Was sollte die neue Aufgabe sein?");
        String neueAufgabe = scanner.nextLine();
        aufgaben.set(eingabe-1, neueAufgabe);

    }
    public static void aufgabeLoeschen() {

        System.out.println(aufgaben);
        System.out.println("Welche Aufgabe willst du löschen?");
        int eingabe = scanner.nextInt();
        aufgaben.remove(eingabe-1);

    }
    public static void programmBeenden() {
        boolean schalter = false;
        System.out.println("Programm beenden...");
        System.exit(0);
    }

}