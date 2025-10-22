package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }

    @Test
    void aufgabeHinzufuegen() {
        Main.aufgabeHinzufuegen("aufgabe 1");
        assertTrue(Main.aufgaben.contains("aufgabe 1"));
    }

    @Test
    void allesAnzeigen() {
    }

    @Test
    void aufgabeBearbeiten() {
        Main.aufgabeHinzufuegen("aufgabe 1");
        Main.aufgabeBearbeiten(1, "aufgabe 2");
        assertTrue(Main.aufgaben.contains("aufgabe 2"));
        assertFalse(Main.aufgaben.contains("aufgabe 1"));
    }

    @Test
    void aufgabeLoeschen() {
        Main.aufgabeHinzufuegen("aufgabe 1");
        Main.aufgabeLoeschen(1);
        assertFalse(Main.aufgaben.contains("aufgabe 1"));
        Main.aufgabeHinzufuegen("aufgabe 2");
        Main.aufgabeLoeschen(1);
        assertFalse(Main.aufgaben.contains("aufgabe 2"));
    }

    @Test
    void programmBeenden() {
    }
}