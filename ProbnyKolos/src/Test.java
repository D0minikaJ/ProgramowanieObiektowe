package pl.uwm.obiektowe.s155445.kolo1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String [] args){
        ArrayList<Osoba> ktos = new ArrayList<Osoba>();
        Osoba osoba1 = new Osoba("Dominika", "KowalskiAnalysis", LocalDate.of(2000, 12, 10));
        Osoba osoba2 = new Osoba("Afsdg", "ASfaFD", LocalDate.of(2000, 12, 11));
        Osoba osoba3 = new Osoba("JHKklgsdfg", "Hkdfgdgdfg", LocalDate.of(2000, 9, 8));
        Osoba osoba4 = new Osoba("HJKhlkdrgd", "Yifgodgfd", LocalDate.of(1999, 9, 20));
        Pracownik pracownik1 = new Pracownik(osoba1, "sprzatacz", 2000);
        ktos.add(pracownik1);
        ktos.add(osoba2);
        ktos.add(osoba3);
        ktos.add(osoba4);
        System.out.println(pracownik1);

        for (Osoba czlowiek: ktos){
            System.out.println(czlowiek);
        }
        for (Osoba czlowiek: ktos){
            int i = 0;
        }
    }
}
