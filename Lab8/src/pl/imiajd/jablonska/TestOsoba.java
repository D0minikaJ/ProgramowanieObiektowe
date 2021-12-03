package pl.imiajd.jablonska;

import java.util.*;

public class TestOsoba
{
    public static void main(String[] args)
    {

        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Student(, "informatyka", 4.5);
        //ludzie[0] = new Pracownik("Jan Kowalski", 50000, 2015-10-10);
        //ludzie[1] = new Student("Nowak", "informatyka", 5.0);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        //(osoba.getNazwisko(), osoba.getImiona(), osoba.getDataUrodzenia(), osoba.isPlec())
        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }

        System.out.println(ludzie[0]);
    }
}
