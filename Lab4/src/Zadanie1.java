import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*
//A
    System.out.println("Podaj napis:");
    String str = sc.nextLine();
    System.out.println("Znak:");
    char c = sc.next().charAt(0);
    System.out.println("countChar:" + countChar(str, c));
//B
    System.out.println("Podaj str:");
    String str = sc.nextLine();
    System.out.println("Podaj substr:");
    String substr = sc.nextLine();
    System.out.println("countSubStr:" + countSubStr(str, substr));
//C
    System.out.println("Podaj str:");
    String str = sc.nextLine();
    System.out.println("middle:" + middle(str));
//D
    System.out.println("Podaj napis:");
    String str = sc.nextLine();
    System.out.println("Podaj liczbe:");
    int n = sc.nextInt();
    System.out.println("repeat:" + repeat(str, n));
    }
//E
    System.out.println("Podaj str:");
    String str = sc.nextLine();
    System.out.println("Podaj substr:");
    String substr = sc.nextLine();
    int [] tab;
    tab = new int [str.length()];
    tab = where(str, substr);
    System.out.println(Arrays.toString(tab));
//F
    System.out.println("Podaj str:");
    String str = sc.nextLine();
    System.out.println("change:" + change(str));
//G
     */
    System.out.println("Podaj str:");
    String str = sc.nextLine();
    System.out.println("nice:" + nice(str));
    }

    public static int countChar(String str, char c){
        int count = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == c)
                count += 1;

        }
        return count;
    }

    public static int countSubStr(String str, String substr){
        int count = 0;
        for (int i=0; i<str.length(); i++){
            if (str.indexOf(substr, i) == i)
                count += 1;
        }
        return count;
    }

    public static String middle(String str){
        int indeks = 0, dlugosc = 0;
        if (str.length() % 2 == 0) {
            indeks = str.length()/2 -1;
            dlugosc = 2;
        }
        else if (str.length() % 2 == 1) {
            indeks = str.length()/2;
            dlugosc = 1;
        }

        return str.substring(indeks, indeks + dlugosc);
    }

    public static String repeat(String str, int n){
        String newstr = "";
        for (int i = 0; i < n; i++){
            //newstr = str.concat(str);
            newstr = newstr.concat(str);
            //System.out.println(i + ":" + "\t" + newstr);
        }
        return newstr;
    }

    public static int [] where(String str, String subStr){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int index = 0;
        while(index != -1){
            index = str.indexOf(subStr, index);
            if (index != -1) {
                arrayList.add(index);
                index++;
            }
        }
        int[] tab = arrayList.stream().mapToInt(i -> i).toArray();
        return tab;
    }

    public static String change (String str){
        StringBuffer sbuff = new StringBuffer(str);
        for (int i = 0; i < str.length(); i++){
            if (Character.isLowerCase(str.charAt(i)))
                sbuff.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            else
                sbuff.setCharAt(i, Character.toLowerCase(str.charAt(i)));
        }
        return sbuff.toString();
    }

    public static String nice (String str){
        StringBuffer sbuff = new StringBuffer();
        int number = Integer.parseInt(str);
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        DecimalFormatSymbols dfs = decimalFormat.getDecimalFormatSymbols();
        dfs.setDecimalSeparator('\'');
        decimalFormat.setDecimalFormatSymbols(dfs);
        decimalFormat.format(number);
        System.out.println(number);
        String newstr = Integer.toString(number);
        sbuff.append(newstr);
        return sbuff.toString();
    }

    public static String nice (char argc, int argint, String str){
        StringBuffer sbuff = new StringBuffer();
        int number = Integer.parseInt(str);
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(argint);
        DecimalFormatSymbols dfs = decimalFormat.getDecimalFormatSymbols();
        dfs.setDecimalSeparator(argc);
        decimalFormat.setDecimalFormatSymbols(dfs);
        decimalFormat.format(number);
        System.out.println(number);
        String newstr = Integer.toString(number);
        sbuff.append(newstr);
        return sbuff.toString();
    }
}