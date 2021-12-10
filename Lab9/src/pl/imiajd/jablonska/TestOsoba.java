package pl.imiajd.jablonska;

import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        Osoba osoba1 = new Osoba("Kowalski", 2000-10-10);
        Osoba osoba2 = new Osoba("Kowalski", 2000-10-11);
        Osoba osoba3 = new Osoba("Lama", 1999-10-10);
        Osoba osoba4 = new Osoba("Alpaka", 1999-10-10);
        Osoba osoba5 = new Osoba("Jablonska", 2000-10-12);
        grupa.add(osoba1);
        grupa.add(osoba2);
        grupa.add(osoba3);
        grupa.add(osoba4);
        grupa.add(osoba5);

        grupa.forEach(System.out::print);

    }
}
