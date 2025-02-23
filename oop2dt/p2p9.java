package oop2dt;

import java.util.Scanner;

public class p2p9 {
    public static void main(String[] arg) {
        int[] tab = new int[7];
        czytanie(tab);
        int wynik = oblicz(tab);
        System.out.println("Wynik to " + wynik);
    }

    public static void czytanie(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("podaj elemnt tablicy nr " + i + ": ");
            a[i] = getInt();
        }
    }

    public static int oblicz(int[] a) {
        int licz = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                licz++;
            }
        }
        return licz;
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
