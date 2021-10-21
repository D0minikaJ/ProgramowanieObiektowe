package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    //Zadanie 1a
    /*
    public static double Zadanie1A() {
        double suma = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("You entered " + n);
        for(int i=1;i<=n;i++){
            double m = input.nextDouble();
            suma += m;
        }
        input.close();
        return suma;
    }
    //Zadanie 1b
    public static double Zadanie1B()
    {
        double mnozenie = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("You entered " + n);
        for(int i=1;i<=n;i++){
            double m = input.nextDouble();
            mnozenie = mnozenie * m;
        }
        input.close();
        return mnozenie;
    }
    //Zadanie1c
    public static double Zadanie1C()
    {
        double suma = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("You entered " + n);
        for(int i=1;i<=n;i++){
            double m = input.nextDouble();
            m = Math.sqrt(m*m);
            suma += m;
        }
        input.close();
        return suma;
    }
    //Zadanie1d
    public static double Zadanie1D()
    {
        double suma = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("You entered " + n);
        for(int i=1;i<=n;i++){
            double m = input.nextDouble();
            m = Math.sqrt(m*m);
            m = Math.sqrt(m);
            suma += m;
        }
        input.close();
        return suma;
    }
    //Zadanie1E
    public static double Zadanie1E()
    {
        double mnozenie = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("You entered " + n);
        for(int i=1;i<=n;i++){
            double m = input.nextDouble();
            m = Math.sqrt(m*m);
            mnozenie *= m;
        }
        input.close();
        return mnozenie;
    }
    //Zadanie1F
    public static double Zadanie1F()
    {
        double suma = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("You entered " + n);
        for(int i=1;i<=n;i++){
            double m = input.nextDouble();
            m = m*m;
            suma += m;
        }
        input.close();
        return suma;
    }
    //Zadanie1G
    public static double[] Zadanie1G()
    {
        double mnozenie = 1.0;
        double suma = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("You entered " + n);
        for(int i=1;i<=n;i++){
            double m = input.nextDouble();
            mnozenie *= m;
            suma += m;
        }
        input.close();
        return new double [] {mnozenie, suma};
    }
    //Zadanie1H
    public static double Zadanie1H()
    {
        double suma = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("You entered " + n);
        for(int i=1;i<=n;i++){
            double m = input.nextDouble();
            double temp = Math.pow(-1, i+1);
            suma += temp * m;
        }
        input.close();
        return suma;
    }
    //Zadanie1I
    public static double Zadanie1I()
    {
        double suma = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("You entered " + n);
        for(int i=1;i<=n;i++){
            double m = input.nextDouble();
            double temp = Math.pow(-1, i+1);
            int fact = 1;
            for(i=1;i<=n;i++){
                fact=fact*i;
            }
            suma += (temp * m)/fact;
        }
        input.close();
        return suma;
    }
    //Zadanie1.2
    public static double[] Zadanie12()
    {
        double suma = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("You entered " + n);
        double[] array = new double[n];
        for(int i=0;i<n;i++){
            array[i]=input.nextDouble();
        }
        input.close();
        return array;
    }
    static void display(double[] a) {
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println(a[0]);
    }
    //Zadanie 2.2
    public static double Zadanie22()
    {
        double suma = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("You entered " + n);
        for(int i=1;i<=n;i++){
            double m = input.nextDouble();
                if  (m>=0)
                {
                    suma += m;
                }
        }
        input.close();
        return 2*suma;
    }

    //Zadanie 2.3

    public static int[] Zadanie23()
    {
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("You entered " + n);
        double[] array = new double[n];
        for(int i=1;i<=n;i++){
            double m = input.nextDouble();
            if  (m>0)
            {
                suma1 += 1;
            }
            else if (m==0)
            {
                suma2 += 1;
            }
            else {
                suma3 += 1;
            }
        }
        input.close();
        return new int [] {suma1, suma2, suma3};
    }

    //Zadanie 2.4

    public static double[] Zadanie24()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("You entered " + n);
        double[] array = new double[n];
        for(int i=0;i<n;i++){
            array[i]=input.nextDouble();
        }
        double max = array[0];
        for(int i=1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        double min= array[0];
        for(int i=1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        double[] array2 = new double[2];
        return new double[] {max, min};
    }
     */

    public static void main(String[] args) {
        /*
        // do 1a
        double sum = Zadanie1A();
        System.out.println(sum);
        //do 1b
        double mnozenie = Zadanie1B();
        System.out.println(mnozenie);
        //do 1c
        double bezwgledna = Zadanie1C();
        System.out.println(bezwgledna);
        //do 1d
        double bezwgledna2 = Zadanie1D();
        System.out.println(bezwgledna2);
        //do 1e
        double bezwgledna3 = Zadanie1E();
        System.out.println(bezwgledna3);
        //do 1f
        double potega = Zadanie1F();
        System.out.println(potega);
        //do 1g
        double sumamnoz[] = Zadanie1G();
        System.out.println(sumamnoz[0]);
        System.out.println(sumamnoz[1]);
        //do 1h
        double suma = Zadanie1H();
        System.out.println(suma);
        //do 1i
        double suma = Zadanie1I();
        System.out.println(suma);
        //do 1.2
        double[] array = Zadanie12();
        display(array);
        //do 2.2
        double suma = Zadanie22();
        System.out.println(suma);
        //do 2.3
        int ilosc[] = Zadanie23();
        System.out.println(ilosc[0]);
        System.out.println(ilosc[1]);
        System.out.println(ilosc[2]);
        //do 2.4
        double ilosc[] = Zadanie24();
        System.out.println(ilosc[0]);
        System.out.println(ilosc[1]);
    */
    }
}