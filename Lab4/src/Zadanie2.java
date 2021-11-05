import java.io.*;
import java.util.*;

public class Zadanie2 {
    public static void main(String[] args) {
        System.out.println("count:" + countChar());
    }

    public static void countChar(char argc) {
        Scanner scannerFile = null;

        try {
            scannerFile = new Scanner(new File("C:/Users/Dominika/Desktop"));
        } catch (FileNotFoundException e) {
        }

        int count = 0;

        while (scannerFile.hasNext()) {
            String character = scannerFile.next();

            int index = 0;
            char star = '*';
            while (index < character.length()) {

                if (character.charAt(index) == argc) {
                    count++;
                }
                index++;
            }
        }
        System.out.println(count);
    }
}
