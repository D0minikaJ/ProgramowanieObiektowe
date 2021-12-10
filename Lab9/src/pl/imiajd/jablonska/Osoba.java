package pl.imiajd.jablonska;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba> {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [" + nazwisko + ", " + dataUrodzenia + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(nazwisko, osoba.nazwisko) &&
                Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    @Override
    public int compareTo(Osoba o){
//        compare two objects of Osoba type
        if (this.nazwisko.equals(o.nazwisko)){
            if(this.dataUrodzenia.equals(o.dataUrodzenia)){
                return 0;
            }
        }
        else if (this.nazwisko.charAt(0) > o.nazwisko.charAt(0)){
            return 1;
        }
        else if (this.nazwisko.charAt(0) < o.nazwisko.charAt(0)){
            return -1;
        }
        return 0;
//        this.nazwisko.compareTo(o.nazwisko);
    }
}

