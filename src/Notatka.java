/**
 * nazwa klasy: Notatka
 * opis:        klasa przeznaczona do robienia notatek
 * pola: licznikNotatek - pole numeryczne przechowujące liczbę notatek
 * identyfikator - pole numeryczne przechowujące unikatowy numer notatki
 * tytulNotatki - pole tekstowe przechowujące tytul Notatkia
 * trescNotatki - pole tekstowe przechowujące tresc Notatkia
 * autor: 0000000000000
 *
 */
public class Notatka {
    private static  int licznikNotatek;
    private int identyfikator;
    protected String tytulNotatki;
    protected  String trescNotatki;

    public Notatka(String tytulNotatki, String trescNotatki) {
        licznikNotatek++;
        identyfikator = licznikNotatek;
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki = trescNotatki;
    }
    public void wypiszTytulTresc(){
        System.out.println("Tytuł: "+tytulNotatki+" Treść: "+trescNotatki);
    }
    public void diagnistyczna(){
        System.out.println(tytulNotatki+", "+trescNotatki+", "+licznikNotatek+", "+identyfikator);
    }
}
