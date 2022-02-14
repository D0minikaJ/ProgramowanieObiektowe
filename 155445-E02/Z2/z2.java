package pl.imiajd.jablonska;

import java.util.ArrayList;

public class Z2 {

    public static <E> void print(Iterable<E> array) {
        array.forEach((i) -> System.out.println("[" + i + "], "));
    }

    public static void main(String[] args) {

        System.out.println("----------String----------");

        ArrayList<String> array = new ArrayList<>();
        array.add("dlugopis");
        array.add("olowek");
        array.add("gumka");
        print(array);
        System.out.println("----------Integer----------");

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(2);
        array2.add(4);
        array2.add(8);
        array2.add(16);
        print(array2);

        System.out.println("----------Double----------");

        ArrayList<Double> array3 = new ArrayList<>();
        array3.add(2.1);
        array3.add(2.2);
        array3.add(2.3);
        array3.add(2.4);
        print(array3);

        System.out.println("----------Float----------");

        ArrayList<Float> array4 = new ArrayList<>();
        array4.add(2.F);
        array4.add(3.F);
        array4.add(4.F);
        array4.add(5.F);
        print(array4);
    }

}

/*Napisz generyczn¡ statyczn¡ metod¦ print, której argumentem jest dowolny obiekt implementuj¡cy interfejs Iterable<E>.
Metoda print wypisuje elementy swojego argumentu w nawiasach kwadratowych i
oddzielaj¡c je przecinkami. W funkcji main przetestuj dziaªanie metody print dla obiektów kilku ró»nych
klas implementuj¡cych interfejs Iterable<E>

