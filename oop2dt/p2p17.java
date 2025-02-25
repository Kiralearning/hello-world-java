package oop2dt;

public class p2p17 {
    public static class Adres {
        private String miasto;
        private String ulica;
        private int nr_domu;

        public Adres(String a, String u, int n) { //constructor
            // public method name == name of the class
            miasto = a;
            ulica = u;
            nr_domu = n;
        }

        public String toString() {
            return "mieszka w miescie " + miasto + " na ulicy " + ulica + " pod numerem "
                    + nr_domu;
        }
    }

    public static class Osoba {
        private String imie;
        private String nazwisko;
        private final int rok_u; // final means constant
        private Adres adres; //field of type "Adres" <= class

        public Osoba(String i, String n, String a, String u, int nr) {//constructor nr1
            adres = new Adres(a, u, nr); //"a", "u", "nr" are used to create new field "adres" (instance of class "Adres")
            imie = i;
            nazwisko = n;
            rok_u = 2000;
        }

        public Osoba(String i, String n, Adres a) {//constructor nr2
            adres = a; //we use already created instance of class "Adres"
            imie = i;
            nazwisko = n;
            rok_u = 2000;
        }

        public String toString() {
            return "Pan/Pani " + imie + " " + nazwisko + " urodzila sie w " + rok_u +
                    " roku " + adres;
        }
    }

    public static void main(String[] arg)
	{
		Osoba o1=new Osoba("jan","Kowalski","Gdansk","dluga",11); // constructor nr1
		Adres a1=new Adres("Warszawa","Nowy swiat",2); //a1 - instance of class "Adres"
		Osoba o2=new Osoba("zygmunt","Nowak",a1); // constructor nr2
		System.out.println(o1); //automathcally calls method "toString"
		System.out.println(o2);
}
}