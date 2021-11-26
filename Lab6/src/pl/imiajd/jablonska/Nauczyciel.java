package pl.imiajd.jablonska;

public class Nauczyciel extends Osoba{
    private int pensja;

    public Nauczyciel(Osoba osoba, int pensja) {
        super(osoba.getNazwisko(), osoba.getRokUrodzenia());
        this.pensja = pensja;
    }

    public int getPensja() {
        return pensja;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + pensja + " zl";
    }
}
