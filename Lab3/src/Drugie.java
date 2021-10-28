import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class Drugie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = input.nextInt();
        if (n <= 1 || n >= 100) {
            System.out.println("Blad");
        }
        System.out.println("Podaj Lewy");
        int lewy = input.nextInt();
        System.out.println("Podaj Prawy");
        int prawy = input.nextInt();
        int max = 999;
        int min = -999;
        int[] tab = new int[n];
        generator(tab, n, min, max);
        System.out.println(Arrays.toString(tab));

        int nieparzyste = ileNieparzystych(tab);
        System.out.println("Nieparzyste:" + '\n' + nieparzyste);
        int parzyste = ileParzystych(tab);
        System.out.println("Parzyste:" + '\n' + parzyste);
        int dodatnie = ileDodatnich(tab);
        System.out.println("Dodatnie:" + '\n' + dodatnie);
        int ujemne = ileUjemnych(tab);
        System.out.println("Ujemne:" + '\n' + ujemne);
        int zerowe = ileZerowych(tab);
        System.out.println("Zerowe:" + '\n' + zerowe);
        int maksymalne = ileMaksymalnych(tab);
        System.out.println("Maksymalne:" + '\n' + maksymalne);
        int dodsum = sumaDodatnich(tab);
        System.out.println("Suma dodatnitch:" + '\n' + dodsum);
        int ujsum = sumaUjemnych(tab);
        System.out.println("Suma ujemnych:" + '\n' + ujsum);
        int dmcd = dlugoscMaksymalnegoCiaguDodatnich(tab);
        System.out.println("Dlugosc max ciagu dodatnich:" + '\n' + dmcd);
        //signum(tab);
        odwrocFragment(tab, lewy, prawy);

    }

    public static void generator(int[] tab, int n, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = random.nextInt((max - min)+1) + min;
        }
    }

    public static int ileNieparzystych (int[] tab)
    {
        int count = 0;
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] % 2 != 0)
            {
                count++;
            }
        }
        return count;
    }

    public static int ileParzystych (int[] tab)
    {
        int count = 0;
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }

    public static int ileDodatnich (int[] tab)
    {
        int count = 0;
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] > 0)
            {
                count++;
            }
        }
        return count;
    }

    public static int ileUjemnych (int[] tab)
    {
        int count = 0;
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] < 0)
            {
                count++;
            }
        }
        return count;
    }

    public static int ileZerowych (int[] tab)
    {
        int count = 0;
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] == 0)
            {
                count++;
            }
        }
        return count;
    }

    public static int ileMaksymalnych (int[] tab)
    {
        int count = 0;
        int max = tab[0];
        for(int i = 1; i < tab.length; i++)
        {
            if(tab[i] > max)
            {
                max = tab[i];
            }
        }
        System.out.println(max);
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] == max)
            {
                count++;
            }
        }
        return count;
    }

    public static int sumaDodatnich (int[] tab)
    {
        int sum = 0;
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] > 0)
            {
                sum+=tab[i];
            }
        }
        return sum;
    }
    public static int sumaUjemnych (int[] tab)
    {
        int sum = 0;
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] < 0)
            {
                sum+=tab[i];
            }
        }
        return sum;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int[] tab){
        int sum = 1;
        for(int i = 1; i < tab.length;i++) {
            if (tab[i-1] >=0 && tab[i] >=0){
                sum +=1;
            }
        }
        return sum;
    }

    public static void signum(int[] tab)
    {
        for(int i = 0; i < tab.length;i++)
        {
            if(tab[i]>0){
                tab[i]=1;
            }
            if(tab[i]<0){
                tab[i]=-1;
            }
            if(tab[i]==0){
                tab[i]=0;
            }
        }
        System.out.println(Arrays.toString(tab));
    }

    public static void odwrocFragment(int[] tab, int lewy, int prawy){
        for (int i = 0; lewy + i <= prawy - i; i++) {
            int temp = tab[lewy+i-1];
            tab[lewy+i - 1] = tab[prawy-i - 1];
            tab[prawy-i - 1] = temp;
        }
        System.out.println(Arrays.toString(tab));
    }

}