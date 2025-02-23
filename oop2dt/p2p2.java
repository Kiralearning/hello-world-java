package oop2dt;

import java.util.Scanner;

// Plik z definicją, deklaracja zmiennych, instrukcją warunkową, pętlą i rzutowaniem
public class p2p2 {
    public static void main(String[] arg) {
        int zm1;
        int zm2;
        Scanner czyt = new Scanner(System.in);
        System.out.print("podaj liczbe nr 1: ");
        zm1 = czyt.nextInt();
        do {
            System.out.print("podaj liczbe nr 2: ");
            zm2 = czyt.nextInt();
            if (zm2 == 0) {
                System.out.println("Błąd!!!");
            }
        } while (zm1 == 0);// pętla nie dopuszcza do wpisania do programu złej wartości
        float wynik = (float) zm1 / zm2;
        System.out.println("Wynik to " + wynik);

        String imie = "Kira";
        boolean czyParzysta;
        czyParzysta = zm1 % 2 == 0;
        // wynik=0;
        if (czyParzysta) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }
        String nazwisko = "Learning";
        String osoba = imie + " " + nazwisko;
        System.out.println("Nazywam się " + osoba.toUpperCase());
        System.out.println("Nazywam się " + osoba);
        int wartBezw;
        wartBezw = zm1 >= 0 ? zm1 : -zm1;
    }

}
