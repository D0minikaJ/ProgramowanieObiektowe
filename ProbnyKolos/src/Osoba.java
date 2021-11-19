package pl.uwm.obiektowe.s155445.kolo1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;


public class Osoba {
    private String name;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private int wiek;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public Osoba (){

    }

    public Osoba (String name, String nazwisko, LocalDate dataUrodzenia) {
        this.name = name;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.wiek = wiek(dataUrodzenia);
    }

    private int wiek(LocalDate dataUrodzenia){
        if (dataUrodzenia == null) return 0;
        LocalDate currentDate = LocalDate.now();
        return Period.between(dataUrodzenia, currentDate).getYears();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
        this.wiek = wiek(dataUrodzenia);
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "Osoba " + name + " " + nazwisko + " urodzona " + dataUrodzenia + ", wiek " + wiek + " ";
    }
}

