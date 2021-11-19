package pl.uwm.obiektowe.s155445.kolo1;

public class Pracownik extends Osoba {
    String stanowisko;
    double pensja;

    public Pracownik() {
    }

    public Pracownik(Osoba osoba, String stanowisko, double pensja){
        super(osoba.getName(), osoba.getNazwisko(), osoba.getDataUrodzenia());
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return super.toString() + "jest pracownikiem na stanowisku " + stanowisko + " z pensja " + pensja + " zl";
    }

}
