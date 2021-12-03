package pl.imiajd.jablonska;
import java.util.*;


class Student extends Osoba
{
    private double sredniaOcen;

    public Student(Osoba osoba, String kierunek, double sredniaOcen)
    {
        super(osoba.getNazwisko(), osoba.getImiona(), osoba.getDataUrodzenia(), osoba.isPlec());
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }

    private String kierunek;
}
