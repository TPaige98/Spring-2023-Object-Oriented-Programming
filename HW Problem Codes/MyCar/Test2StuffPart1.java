import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class Test2StuffPart1 
{
    public static void main(String [] args)
    {
        System.out.println("---------- NUMBER 1 ----------");

        Random Paige = new Random();

        for(int i = 0; i < 5; i++)
        {
            System.out.print(Paige.nextInt() + " ");
        }

        System.out.println();

        for(int i = 0; i < 5; i++)
        {
            System.out.print(Paige.nextDouble() + " ");
        }

        System.out.println();

        for(int i = 0; i < 5; i++)
        {
            System.out.print((Paige.nextInt(99) + 1) + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("---------- NUMBER 2 ----------");

        Random num2 = new Random();

        ArrayList<Integer> Rand100 = new ArrayList<Integer>();
        int[] Numbers100 = new int[100];

        for(int i = 0; i < 100; i++)
        {
            Rand100.add(num2.nextInt(9) + 1);
        }

        for(int i = 0; i < Rand100.size(); i++)
        {
            System.out.print(Rand100.get(i) + " ");
        }

        for (int numCount: Rand100)
        {
            Numbers100[numCount]++;
        }

        System.out.println();
        System.out.println("1's = " + Numbers100[1] + " | 2's = " + Numbers100[2]
        + " | 3's = " + Numbers100[3] + " | 4's = " + Numbers100[4] + " | 5's = " + Numbers100[5]
        + " | 6's = " + Numbers100[6] + " | 7's = " + Numbers100[7] + " | 8's = " + Numbers100[8]
        + " | 9's = " + Numbers100[9]);
        
        System.out.println();
        System.out.println("---------- NUMBER 3 ----------");

        Random TPaige = new Random();

        ArrayList<Integer> TrevorPaige = new ArrayList<Integer>();

        for(int i = 0; i < 8; i++)
        {
            TrevorPaige.add((TPaige.nextInt()));
        }

        for(int i = 0; i < TrevorPaige.size(); i++)
        {
            System.out.print(TrevorPaige.get(i) + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("---------- NUMBER 4 ----------");

        LinkedList<Integer> PaigeTrevor = new LinkedList<Integer>();

        for(int i = 0; i < 88; i++)
        {
            PaigeTrevor.add(i);
        }

        for(int i = 0; i < PaigeTrevor.size(); i++)
        {
            System.out.print((PaigeTrevor.get(i) + 1) + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("---------- NUMBER 5 ----------");

        int i = 1;
        Random PaigeT = new Random();

        List<Integer> tPaige = Collections.synchronizedList(new ArrayList<Integer>());

        while (i <= 8) 
        {
            tPaige.add(PaigeT.nextInt());
            i++;
        }

        System.out.println(tPaige);

        System.out.println();
    }
}