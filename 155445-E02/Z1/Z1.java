package pl.imiajd.jablonska;

import java.time.LocalTime;

public class Z1 {
    public static <T extends Comparable<? super T>> boolean isSorted (T[] array)
    {
        for (int i=1; i < array.length; i++){
            if(array[i-1].compareTo(array[i]) > 0){
                return false;
            }
        }
        return true;
    }

    public static void main (String[]args){
        Integer[] array = {1, 2, 3, 4, 5};
        String[] array2 = {"Java", "C", "Python"};
        LocalTime[] array3 = {LocalTime.MAX, LocalTime.NOON, LocalTime.MIN};
        Integer[] array4 = {5, 4, 3, 2, 1};
        String[] array5 = {"A", "B", "C"};
        LocalTime[] array6 = {LocalTime.MIN, LocalTime.MIN, LocalTime.MAX};

        System.out.println(isSorted(array));
        System.out.println(isSorted(array2));
        System.out.println(isSorted(array3));
        System.out.println("---------------------- Drugi test ---------------------------");
        System.out.println(isSorted(array4));
        System.out.println(isSorted(array5));
        System.out.println(isSorted(array6));
    }
}
/*
Napisz statyczn¡ generyczn¡ metod¦ ArrayUtil.isSorted, która sprawdza czy podana jako argument
tablica obiektów klasy T jest uporz¡dkowana niemalej¡co. W denicji metody zadeklaruj, »e klasa T musi
implementowa¢ generyczny interfejs Comparable. W funkcji main przetestuj dziaªanie metody isSorted
dla posortowanych i nieposortowanych tablic obiektów klas Integer, LocalTime oraz String.


