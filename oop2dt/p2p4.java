package oop2dt;

import java.util.Scanner;

public class p2p4 {
	public static void main(String[] arg) {
		int x, y;
		float suma = 0;
		Scanner czyt = new Scanner(System.in);
		char odp = 't';
		while (odp == 't' || odp == 'T') {
			System.out.print("podaj pierwszą liczbę: ");
			x = czyt.nextInt();
			System.out.print("podaj drugą liczbę: ");
			y = czyt.nextInt();
			if (y == 0) {
				continue;
			}
			suma = suma + ((float) x / y);
			System.out.print("Czy kontynuowac?");
			odp = czyt.next().charAt(0);

		}
		System.out.println("Suma ilorazów to " + suma);
	}
}
