package pl.imiajd.jablonska;

public class Student extends Osoba{
    private String kierunek;

    public Student(Osoba osoba, String kierunek) {
        super(osoba.getNazwisko(), osoba.getRokUrodzenia());
        this.kierunek = kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + kierunek;
    }
}
