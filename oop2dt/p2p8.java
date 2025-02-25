package oop2dt;

import java.util.Scanner;

public class p2p8 {
    public static void main(String[] arg) {
        int a, b;
        System.out.print("Podaj a: ");
        a = getInt();
        System.out.print("Podaj b: ");
        b = getInt();
        long wynik = oblicz(a, b);
        System.out.println("Wynik to " + wynik);
        // System.out.println(arg[0]+ " " + arg[1]);
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static long oblicz(int a, int b) {
        return (long) a * a + b * b;
    }
}
