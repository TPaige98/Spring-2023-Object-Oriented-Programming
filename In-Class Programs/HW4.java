import java.util.Scanner;
import java.util.HashMap;

public class HW4 
{
    public static void main(String [] args)
    {
        //NUMBER 1//
        System.out.println("HW Number 1 - Epsilon Threshold - Equal and Not Equal Example");
        System.out.println("-------------------------------------------------------------");

        double x = 8.1;
        double y = 8.0999999;
        double z = 8.0999991;

        final double epsilon = 1E-7;
        if(Math.abs(x - y) <= epsilon)
            {
                System.out.println("x is approximately equal to y");
            }
        else
            { 
                System.out.println("x is not approximately equal to y");
            }

        if(Math.abs(z - y) <= epsilon)
            {
                System.out.println("z is approximately equal to y");
            }
        else
            { 
                System.out.println("z is not approximately equal to y");
            }


        //NUMBER 2//
        System.out.println();
        System.out.println("HW Number 2 - Comparing 'non and NON'");
        System.out.println("-------------------------------------");

        String a = "non";
        String b = "NON";
        System.out.println("result of equals is: " + (a.equals(b)));
        System.out.println("result of equalsIgnoreCase is: " + (a.equalsIgnoreCase(b)));


        //NUMBER 3//
        System.out.println();
        System.out.println("HW Number 3 - Lexicographically Comparing Two Words");
        System.out.println("---------------------------------------------------");

        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String c = sc.next();
            System.out.print("Enter another word: ");
            String d = sc.next();
            sc.close();

            System.out.println();
            System.out.println("You entered: " + c + " and " + d);

            if(c.compareToIgnoreCase(d) < 0)
            {
                System.out.println(c + " comes first");
            }
            else if(c.compareToIgnoreCase(d) > 0)
            {
                System.out.println(d + " comes first");
            }
            else
            {
                System.out.println("The words are the same");
            }
        }
        catch(Exception e)
        {
            System.out.println("error occurred " + e.getMessage());
        }


        //NUMBER 4//
        System.out.println();
        System.out.println("HW Number 4 - HashMap");
        System.out.println("---------------------");

        HashMap <String,String> one = new HashMap<String,String>();
        one.put("alpha", "1");

        HashMap <String,String> two = new HashMap<String,String>();
        two.put("alpha", "1");

        HashMap <String,String> three = new HashMap<String,String>();
        three.put("beta", "2");

        System.out.println("HashMap 1 contains: " + one);
        System.out.println("HashMap 2 contains: " + two);
        System.out.println("HashMap 3 contains: " + three);

        System.out.println();

        System.out.println("1 = 2: " + one.equals(two));
        System.out.println("1 = 3: " + one.equals(three));
        System.out.println("2 = 3: " + two.equals(three));
        
    }
}
