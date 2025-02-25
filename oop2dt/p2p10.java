package oop2dt;

import java.util.Scanner;

public class p2p10 {
    public static void main(String[] arg) {
        String imie = "";
        String nazwisko = "";
        System.out.print("podaj imie: ");
        imie = getString();
        System.out.print("podaj nazwisko: ");
        nazwisko = getString();
        imie = imie.replace("a", "ieshka");
        String nowy = imie.substring(0, 1).toUpperCase() + imie.substring(1).toLowerCase()
                + " " + nazwisko.substring(0, 1).toUpperCase() + nazwisko.substring(1).toLowerCase();
        System.out.println("Witaj " + nowy);
        String sprawdz = "Kirieshka";
        if (imie.equalsIgnoreCase(sprawdz)) {
            System.out.println("Podales dobre imie");
        } else {
            System.out.println("Podales zle imie");
        }

    }

    public static String getString() {
        return new Scanner(System.in).next();
    }

}
