import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class cs_3033_airplane_driver
{
    public static void main(String [] args)
    {
        try
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter a word");
            String the_input = sc.next(); //next string token or word item
            System.out.println("you entered " + the_input);
            
            System.out.println("enter another word");
            String the_line_of_input = sc.next();
            System.out.println("now you entered " + the_line_of_input);

            String strnum = ("88.8");
            double the_number = Double.parseDouble(strnum); //static method parseDouble()
                                                              //static method of class Double
            double x = 10 + the_number;
            System.out.println("x = " + x);
        }
        catch(Exception e)
        {
            System.out.println("error occurred " + e.getMessage());
        }

        System.out.println("========================");
        
        airplane the_airplane = new airplane(); //default constructor: parameters are zero.
                                                //constructs object the_airplane on the heap.
        airplane value_airplane = new airplane(1200.0, 88.8);

        the_airplane.change_the_height(8.0);
        the_airplane.change_the_speed(588.7);

        System.out.println("the_airplane.get_the_height() = " + the_airplane.get_the_height());
        System.out.println("the_airplane.get_the_speed() = " + the_airplane.get_the_speed());

        //java: base class is essentially a string as far as numbers and things stored go.
        //true base class is object, but everything can be converted to and from a string
        //you can use this to check if things can be converted from one data type
        //to another. for example, string representation of an int to an actual int for doing math. 

        value_airplane.change_the_height(8.0);
        value_airplane.change_the_speed(13.8);

        System.out.println("value_airplane.get_the_height() = " + value_airplane.get_the_height());
        System.out.println("value_airplane.get_the_speed() = " + value_airplane.get_the_speed());
    }
}