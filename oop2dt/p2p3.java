package oop2dt;

import java.util.Scanner;

public class p2p3 {
	public static void main(String[] arg) {
		int x, y;
		float suma = 0;
		Scanner czyt = new Scanner(System.in);
		while (true) {
			System.out.print("podaj pierwszą liczbę: ");
			x = czyt.nextInt();
			System.out.print("podaj drugą liczbę: ");
			y = czyt.nextInt();
			if (y == 0) {
				break;
			}
			suma = suma + ((float) x / y);
		}
		System.out.println("Suma ilorazów to " + suma);
	}

}
