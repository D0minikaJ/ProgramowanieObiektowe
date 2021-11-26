package pl.imiajd.jablonska;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    private void pokaz(){
        System.out.println(kod_pocztowy + ", " + miasto + '\n');
        System.out.println(ulica + " " + numer_domu + "/" + numer_mieszkania);
    }

    public boolean przed(Adres kod){
        String adres1 = kod_pocztowy.replace("-", "");
        String adres2 = kod.kod_pocztowy.replace("-", "");
        Integer valueOf1 = Integer.valueOf(adres1);
        Integer valueOf2 = Integer.valueOf(adres2);
        if (valueOf1 < valueOf2)
            return true;
        return false;
    }


}
