package pl.imiajd.jablonska;
import java.time.LocalDate;
import java.util.*;


class Pracownik extends Osoba
{
    private LocalDate dataZatrudnienia;

    public Pracownik(Osoba osoba, double pobory, LocalDate dataZatrudnienia)
    {
        super(osoba.getNazwisko(), osoba.getImiona(), osoba.getDataUrodzenia(), osoba.isPlec());
        this.dataZatrudnienia = dataZatrudnienia;
        this.pobory = pobory;
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    private double pobory;
}