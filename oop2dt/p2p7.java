package oop2dt;
import java.util.Scanner;
public class p2p7 {
    public static void main(String[] arg)
	{
		int[] tablica= new int[7];
		Scanner czyt=new Scanner(System.in);
		long suma=0;
		for(int x:tablica)
		{
			System.out.print("podaj liczbe do summy: ");
			x=czyt.nextInt();
			suma+=x;
		}
		System.out.print("Suma elemenrów to "+suma);
	}
}
