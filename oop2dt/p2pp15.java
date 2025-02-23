package oop2dt;

import java.util.Scanner;

public class p2pp15 {
    public static class Produkt {
        private String nazwa;
        private float cena;
        private int waga;
        private final int przelicznik;

        public void setNazwa(String nazwa) {
            this.nazwa = nazwa;
        }

        public void setCena(float cena) {
            this.cena = cena;
        }

        public void setWaga(int waga) {
            this.waga = waga;
        }

        public String getNazwa() {
            return nazwa;
        }

        public float getCena() {
            return cena;
        }

        public int getWaga() {
            return waga;
        }

        public Produkt(String n, float c, int w) {
            nazwa = n;
            cena = c;
            waga = w;
            przelicznik = 2;
        }

        public Produkt() {
            nazwa = "";
            cena = 0;
            waga = 0;
            przelicznik = 1;
        }

        public Produkt(float cena, int waga) {
            nazwa = "";
            this.cena = cena;
            this.waga = waga;
            przelicznik = 1;
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
            return "Produkt " + nazwa + " wazy " + waga + " kg. i kosztuje " + cena + " zl.";
        }
    }

    public static void main(String[] arg) {
        Produkt p1 = new Produkt("czeresnia", 20, 2);
        Produkt p2 = new Produkt();
        Produkt p3 = new Produkt(20, 3);
        p3.setNazwa("gruszka");
        // p1.setNazwa("czeresnia");
        // p1.setCena(20);
        // p1.setWaga(2);
        p2.wczytaj();
        if (p1.getCena() * p1.getWaga() > p2.getCena() * p2.getWaga()) {
            System.out.println(p1);
        } else {
            System.out.println(p2);
        }
        System.out.println(p3);
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
