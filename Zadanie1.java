import java.util.ArrayList;
import java.util.Arrays;

public class Zadanie1 {

    public static void main(String[] args){
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        array1.add(1);
        array1.add(4);
        array1.add(9);
        array1.add(16);
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(9);
        array2.add(7);
        array2.add(4);
        array2.add(9);
        array2.add(11);
        ArrayList<Integer> array = new ArrayList<Integer>();
        //array = append(array1, array2);
        array = merge(array1, array2);
        //array = reversed(array1);
        //array = reversed(array1);
        array.forEach(x -> System.out.println(x));
        //1, 4, 16, 9, 9, 7, 4, 9, 11
        //1, 9, 4, 7, 9, 4, 16, 9, 11

    }

    public static ArrayList<Integer> append (ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.addAll(a);
        array.addAll(b);
        return array;
    }


    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        /*ArrayList<Integer> shorter = null;

        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i=0; i < a.size(); i++){
            int element = array.get(i);
            array.add(element);
            System.out.println(element);
            for (int j=0; i < b.size(); j++){
                int element2 = array.get(j);
                array.add(element2);
                System.out.println(element2);

            }
        }
        */
        ArrayList<Integer> shorter = new ArrayList<Integer>();
        ArrayList<Integer> longer = new ArrayList<Integer>();
        ArrayList<Integer> merged = new ArrayList<Integer>();

        if (a.size() < b.size() || a.size() == b.size()){
            shorter = a;
            longer = b;
        }
        else {
            shorter = b;
            longer = a;
        }

        for(int i = 0; i > shorter.size(); i++){
            merged.add(shorter.get(i));
            merged.addAll(longer.subList(i, longer.size()));
        }
        return merged;
    }


    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer>b){
        ArrayList<Integer> array = new ArrayList<Integer>();
        a.sort(null);
        b.sort(null);

        return array;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = a.size() - 1; i >= 0; i--){
            array.add(a.get(i));
        }
        return array;
    }

    public static void reverse(ArrayList<Integer> a){
        //clone
        for (int i = 0; i < a.size()/2; i++){
            int element = a.get(i);
            a.set(i, a.get(a.size() - i - 1));
            a.set(a.size() - i - 1, element);
        }
    }
}
