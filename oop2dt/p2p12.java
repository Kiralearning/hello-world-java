package oop2dt;
import java.util.Scanner;
public class p2p12 {
    public static void main(String[] arg)
	{float[] tablica=new float[5];
	wczytaj(tablica);
	for(int i=0; i<tablica.length; i++)
	{
		System.out.println(tablica[i]);
	}
	}
	
	public static void wczytaj(float[] a)
	{ float b;
		for (int i=0; i<a.length; i++)
		{
			System.out.print("podaj element nr "+i+": ");
			b=getFloat();
			a[i]=oblicz(b);
		}
	}
	
	public static float getFloat()
	{return new Scanner(System.in).nextFloat();}
	
	public static float oblicz(float c)
	{
		return c*c*(float)Math.sqrt(c);
	}
}
