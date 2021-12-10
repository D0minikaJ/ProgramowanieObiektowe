package pl.imiajd.jablonska;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba> {

    public Student(String nazwisko, LocalDate dataUrodzenia) {
        super(nazwisko, dataUrodzenia);
    }
    private double sredniaOcen;



    public int compareTo(Student s){
        if (super.compareTo(s) == 0){
            return this.sredniaOcen - s.sredniaOcen;
        }
        return super.compareTo(s);
    }
}

//String plik = args[0];
/*
public static int coutCharsinFile(String filePath, char charToFind){
    int numberOfChars = 0;
    try {
        FileReader file = new FileReader(filePath);
        numberOfChars =
    }
    catch(FileNotFoundException e){
    e.printStackTrace();
    }
    }
*/