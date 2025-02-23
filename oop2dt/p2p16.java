package oop2dt;

public class p2p16 {
    public static class PytanieWartosci {
        private int liczba;
        private boolean wartoscLogiczna;
        private String nazwa;

        public String toString() {
            return liczba + " " + wartoscLogiczna + " " + nazwa;
        }
    }

    public static void main(String[] args) {
        PytanieWartosci o = new PytanieWartosci();
        System.out.println(o);
    }
}
