package oop2dt;
import java.util.Scanner;
public class p2p11 {
    public static void main(String[] arg)
	{
		String zmS;
		int zmI;
		float zmF;
		System.out.print("Podaj ciag znakow: ");
		zmS=getString();
		System.out.print("Podaj liczbe calkowita: ");
		zmI=getInt();
		System.out.print("Podaj liczbe rzeczywista: ");
		zmF=getFloat();
		float wynik=oblicz(zmI);
		System.out.println("Wynik na liczbie calkowitej to "+wynik);
		wynik=oblicz(zmF);
		System.out.println("Wynik na liczbie calkowitej to "+wynik);
		wynik=oblicz(zmI,zmF);
		System.out.println("Wynik na liczbie calkowitej to "+wynik);
		
		System.out.println("Wynik na liczbie calkowitej to "+oblicz(zmS));
	}
	public static String getString()
	{return new Scanner(System.in).next();}
	public static int getInt()
	{return new Scanner(System.in).nextInt();}
	public static float getFloat()
	{return new Scanner(System.in).nextFloat();}
	
	
	public static float oblicz(int a)
	{	float wynik=(float)a*a*(a-2);
		return wynik;}
	public static float oblicz(float b)
	{
		float wynik=b*b;
		if (b-1!=0) {return wynik/(b-1);}
		else {return wynik;}
	}
	public static float oblicz(int a, float b)
	{
		return a*b;
	}
	public static String oblicz(String a)
	{return a.toUpperCase();}
}
