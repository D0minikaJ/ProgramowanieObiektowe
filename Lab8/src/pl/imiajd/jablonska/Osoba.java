package pl.imiajd.jablonska;
import java.util.*;
import java.time.LocalDate;


abstract class Osoba
{
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;

    public Osoba(String nazwisko, String [] imiona, LocalDate dataUrodzenia, boolean plec)
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public String[] getImiona() {
        return imiona;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean isPlec() {
        return plec;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    private String nazwisko;
}