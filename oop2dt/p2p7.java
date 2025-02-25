package oop2dt;

import java.util.Scanner;

public class p2p7 {
	public static void main(String[] arg) {
		int[] tablica = new int[7]; // 7 elements, indexes starting from 0 to 6 
		Scanner czyt = new Scanner(System.in);
		long suma = 0;
		for (int x : tablica) {  // for (int x = 0; x < tablica.length; x++)
			// tablica[x]
			System.out.print("podaj liczbe do summy: ");
			x = czyt.nextInt();
			suma += x; // suma = suma + x
		}
		System.out.println("Suma elemenrów to " + suma);
		System.out.println(tablica);
		System.out.println(tablica[0] + " " + tablica[1] + " " + tablica[2] + " " + tablica[3] + " " + tablica[4] + " " + tablica[5] + " " + tablica[6]);
		//the result is: 0 0 0 0 0 0 0 because in short cycle for we have values are not stored back in array
	}
}
