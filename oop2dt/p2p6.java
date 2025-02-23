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
		for (int i = 0; i < a.length(); i++) {
			k = a.length() - i - 1;
			b = b + a.charAt(k);
		}
		if (a.equals(b)) {
			System.out.println("To palindron");
		} else {
			System.out.println("To nie palindron");
		}
	}

}
