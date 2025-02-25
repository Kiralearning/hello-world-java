package oop2dt;

import java.util.Scanner;

public class p2p6 {
	public static void main(String[] arg) {
		Scanner czyt = new Scanner(System.in);
		String a;
		String b = "";
		int k;
		System.out.print("Podaj słowo: ");
		a = czyt.next();
		for (int i = 0; i < a.length(); i++) {  // create reversed string
			k = a.length() - i - 1; // get char reversed
			b = b + a.charAt(k);    // append char to "b"
		}

		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);    // append char to "b"
		}

		if (a.equals(b)) {  // == is not working for Strings in Java
			System.out.println("To palindron");
		} else {
			System.out.println("To nie palindron");
		}
	}

}
