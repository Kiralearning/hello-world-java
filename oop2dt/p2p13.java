package oop2dt;

import java.util.Scanner;

public class p2p13 {
    public static class Samochod { //class is like a blueprint
        //variables/fields/attributes/data:
        private String marka;
        private String kolor;
        private int predkosc;
        private int liczba_kol = 4;

        //methods/functions/behaviours:
        public void ustawKolor(String k) { //ustawKolor - setColor
            kolor = k;
        }

        public void ustawMarka(String m) {
            marka = m;
        }

        public void ustawPredkosc(int p) {
            predkosc = p;
        }

        public void ustawKola(int i) {
            liczba_kol = i;
        }

        public String toString() {//specific method to allow printing
            return "Samochod " + marka + " ma kolor " + kolor + " i jedzie z predkoscia " +
                    predkosc + " na " + liczba_kol + " kolach";
        }
        // public void wypisz()
        // {
        // System.out.print("Samochod "+marka+" ");
        // System.out.print("ma kolor "+kolor+" i jezdzi z predkoscia ");
        // System.out.println(predkosc);
        // }

        
    }

    public static void main(String[] arg) {
        Samochod s1 = new Samochod(); //s1 is an instance of the class Samochod
        Samochod s2 = new Samochod();
        System.out.print("Podaj marke: ");
        String m = getString();
        s1.ustawMarka(m); //set field "marka" to value of "m"
        System.out.print("Podaj kolor: ");
        m = getString();
        s1.ustawKolor(m);
        System.out.print("Podaj predkosc: ");
        int k = getInt();
        s1.ustawPredkosc(k);
        System.out.println(s1);
        // s1.wypisz();
        s2.ustawMarka("BMW");
        s2.ustawKolor("rozowy");
        s2.ustawPredkosc(90);
        s2.ustawKola(2);
        System.out.println(s2);
        // s2.wypisz();
        Samochod s3 = s1; //changes to s3 will also update s1
        s3.ustawKolor("red");
        System.out.println(s3);
        // s3.wypisz();
        System.out.println(s1);
        // s1.wypisz();
        Samochod s4 = new Samochod();
        System.out.println(s4);
        // s4.wypisz();
    }

    public static String getString() {
        return new Scanner(System.in).next();
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
