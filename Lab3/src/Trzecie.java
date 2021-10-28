import java.util.Scanner;
import java.util.Random;

public class Trzecie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj m, n k");
        int m = input.nextInt();
        int n = input.nextInt();
        int k= input.nextInt();
        int min = -10;
        int max = 10;
        int [][] m1 = new int[m][n];
        int [][] m2 = new int[n][k];
        if (n <= 1 || n >= 10) {
            System.out.println("Blad");
        }
        generator(m1, m, n, min, max);
        generator(m2, n, k, min, max);
        printMatrix(m1);
        printMatrix(m2);
        int [][] m3 = iloczyn(m1, m2, m, n, k);
        printMatrix(m3);
    }

    public static void generator(int[][] m1, int m, int n, int min, int max) {
        Random random = new Random();
        for (int i=0; i<m; i++) {
            for(int j=0; j<n; j++){
                m1[i][j] = random.nextInt((max - min)+1) + min;
            }
        }
    }

    public static void printMatrix (int[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] iloczyn(int[][] m1, int[][] m2, int m, int n, int k) {
        int[][] m3 = new int[m][k];
        for (int i=0; i < m; i++){
            for (int j=0; j<k; j++){
                for (int l=0; l<n; l++){
                    m3[i][j] += m1[i][l] * m2[l][j];
                }
            }
        }
        return m3;
    }
}
