import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW3
{
    //public HW3()
    //{
      //  balance = 88.8;
    //}
    public static void main(String [] args)
    {
        double balance = 88.8;
        long roundit = Math.round(balance);
        System.out.println(roundit);

        String name1 = ("Jeff");
        String name2 = ("McAlester");
        String names = name1 + " " + name2;
        System.out.println(names);

        String strnum = ("345.32");
        double strdouble = Double.parseDouble(strnum);
        System.out.println(strnum);

        //int myInt;
        //String my_string = Integer.toString(myInt);
        //System.out.println(my_string);

        String greet = "Hello World";
        String subGreet = greet.substring(7, 11);
        System.out.println(subGreet);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int newInt = in.nextInt();
        System.out.println("You Entered: " + newInt);
    }
}