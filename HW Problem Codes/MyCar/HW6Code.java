import java.util.Random;
import java.util.ArrayList;

public class HW6Code 
{
    public static void main(String [] args)
    {
        System.out.println("---------- NUMBER 1 ----------");

        Random num1 = new Random();

        for(int i = 0; i < 5; i++)
        {
            System.out.print(num1.nextInt() + " ");
        }

        System.out.println();

        for(int i = 0; i < 5; i++)
        {
            System.out.print(num1.nextDouble() + " ");
        }

        System.out.println();

        for(int i = 0; i < 5; i++)
        {
            System.out.print((num1.nextInt(6) + 1) + " ");
        }

        System.out.println();
        System.out.println();
        

        //-----------------------------------------------------------------------------------------------//

        System.out.println("---------- NUMBER 2 ----------");


        int[] A2 = {0, 1, 2, 3, 4, 5};
        Integer[] B2 = {0, 1, 2, 3, 4, 5};

        for(int i = 0; i < 6; i++)
        {
            System.out.print(A2[i] + " ");
        }
        
        System.out.println();

        for(int i = 0; i < 6; i++)
        {
            System.out.print(B2[i] + " ");
        }

        System.out.println(); 

        ArrayList<Integer> C2  = new ArrayList<Integer>();
        C2.add(0);
        C2.add(1);
        C2.add(2);
        C2.add(3);
        C2.add(4);
        C2.add(5);

        for(int i = 0; i < C2.size(); i++)
        {
            System.out.print(C2.get(i) + " ");
        }

        //It is not possible to use int as an ArrayList, so we can only make 3 arrays in this problem. One as an int, one as an Integer, and an ArrayList as Integer.

        System.out.println();
        System.out.println();


        //-----------------------------------------------------------------------------------------------//

        System.out.println("---------- Number 3 ----------");

        Random num2 = new Random();

        ArrayList<Integer> Rand100 = new ArrayList<Integer>();

        for(int i = 0; i < 100; i++)
        {
            Rand100.add((num2.nextInt(9) + 1));
        }

        System.out.print("Before Removing First 3: ");

        for(int i = 0; i < Rand100.size(); i++)
        {
            System.out.print(Rand100.get(i) + " ");
        }

        System.out.println();
        System.out.println("Location of First 3: " + Rand100.indexOf(3));

        Rand100.remove(Rand100.indexOf(3));

        System.out.print("After Removing First 3: ");

        for(int i = 0; i < Rand100.size(); i++)
        {
            System.out.print(Rand100.get(i) + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Sources used for number 3: http://testingpool.com/find-out-first-and-last-occurrence-of-elements-in-arraylist/#:~:text=Find%20out%20first%20occurrence%20of,not%20present%20it%20returns%20%2D1.");
        System.out.println("------------------------------");
    }
}
