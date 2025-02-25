package oop2dt;

public class p2p16 {
    public static class PytanieWartosci {
        private int liczba; //default value is 0
        private boolean wartoscLogiczna; //default value is false
        private String nazwa; //default value is null

        public String toString() {
            return liczba + " " + wartoscLogiczna + " " + nazwa;
        }
    }

    public static void main(String[] args) {
        PytanieWartosci o = new PytanieWartosci();
        System.out.println(o);
    }
}
