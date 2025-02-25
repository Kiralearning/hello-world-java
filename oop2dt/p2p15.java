package oop2dt;

import java.util.Scanner;

public class p2p15 {
    public static class Produkt {
        private String nazwa;
        private float cena;
        private int waga;

        public void setNazwa(String nazwa) {
            this.nazwa = nazwa; //"this" is a reference to the current object
        }

        public void setCena(float cena) { //setCena modifies the value of "this.cena" to "cena"
            this.cena = cena;
        }

        public void setWaga(int waga) {
            this.waga = waga;
        }

        public String getNazwa() {
            return nazwa; //return this.nazwa
        }

        public float getCena() {
            return cena;
        }

        public int getWaga() {
            return waga;
        }

        public void wczytaj() {
            System.out.print("Podaj nazwę: ");
            nazwa = getString();
            System.out.print("Podaj cenę: ");
            cena = getFloat();
            System.out.print("Podaj wagę: ");
            waga = getInt();
        }

        public String toString() {
            return "Produkt " + nazwa + " wazy " + waga + " kg i kosztuje " + cena + " zl";
        }
    }

    public static void main(String[] arg) {
        Produkt p1 = new Produkt();
        Produkt p2 = new Produkt();
        p1.setNazwa("wisznia");
        p1.setCena(20);
        p1.setWaga(2);
        p2.wczytaj();
        if (p1.getCena() * p1.getWaga() > p2.getCena() * p2.getWaga()) {
            System.out.println(p1);
        } else {
            System.out.println(p2);
        }
    }

    public static String getString() {
        return new Scanner(System.in).next();
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static float getFloat() {
        return new Scanner(System.in).nextFloat();
    }
}
