package oop2dt;

import java.util.Scanner;

public class p2p18 {
    public static class zwierze {
        private String nazwa;
        private String rodzaj;
        private int l_nog;
        private float waga;

        public zwierze() { // constructor nr1, no arguments - set default values
            nazwa = "";
            rodzaj = "";
            l_nog = 0;
            waga = 0;
        }

        public zwierze(String n, String r, int l, float w) {  // constructor nr2 - set values according to method arguments
            nazwa = n;
            rodzaj = r;
            l_nog = l;
            waga = w;
        }

        public void wczytaj() { //input values of zwierze
            System.out.print("Podaj nazwę: ");
            nazwa = getString();
            System.out.print("Podaj rodzaj: ");
            rodzaj = getString();
            System.out.print("Podaj liczbę nóg: ");
            l_nog = getInt();
            System.out.print("Podaj wagę: ");
            waga = getFloat();
        }

        public String toString() {
            return "Zwierze " + nazwa + ", ktore jest "
                    + rodzaj + "ma " + l_nog + " nog i waży " + waga + " kg.";
        }

        public boolean equals(zwierze z) { //compare zwierze
            if (z == null || this.getClass() != z.getClass()) { //"this" current instance of class "zwierze"
            //getClass() returns class name of the object, not all fields of the object
            //this.getClass() != z.getClass()
            //comparing class name of "this" with class name of "z"(z argument of method equals)
                return false;
            }
            if (z.nazwa == null || z.rodzaj == null) { 
                return false;
            }
             if (nazwa.equals(z.nazwa) && rodzaj.equals(z.rodzaj) && l_nog == z.l_nog &&
                    waga == z.waga)
                return true;
            else
                return false;
        }
    }

    public static class zwierzyniec {
        private zwierze[] z; //z - field(pole) of class "zwierzyniec"
        //field "z" is array(шкаф, массив) of class "zwierze"

        public zwierzyniec() { //constructor nr1, no arguments - set default values
            for (int i = 0; i < 3; i++) { // i = 0, 1, 2 
                //cycle create a tree instances of class "zwierze"
                //z[0] z[1] z[2]
                z[i].nazwa = "";
                z[i].rodzaj = "";
                z[i].l_nog = 0;
                z[i].waga = 0;
            }
        }

        public void wczytaj_zwierz() {
            for (int i = 0; i < 3; i++) {
                z[i].wczytaj();
            }
        }

        public boolean equals(zwierzyniec p) {
            boolean zm = true;
            for (int i = 0; i < 3; i++) {
                if (!z[i].equals(p.z[i])) {
                    zm = false;
                }
            }
            return zm;
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

    public static void main(String[] arg) {
        zwierze z1=new zwierze("Burek","pies",4,15);
        zwierze z2=new zwierze();
        zwierze z3=z1;
        z2.wczytaj();  
        if (z1.equals(z2))  // z1 == "this" and z2 == "z" argument
        {System.out.println("To są takie same egzemplarze");}
        else
        {System.out.println("To są inne egzemplarze");}
        if (z1==z3)
        {System.out.println("To są takie same egzemplarze");}
        else
        {System.out.println("To są inne egzemplarze");}

    }
}
