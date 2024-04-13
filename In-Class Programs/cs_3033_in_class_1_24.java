import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class cs_3033_in_class_1_24 {
    
    public static void main(String [] args)
    {
        airplane the_airplane = new airplane();
        //the airplane is an object of type airplane
        //the new command keyword must be used to create the object on the heap
        //memory management is handled so the programmer does not need to
        //worry about deleting pointers and loss of memory due to programming issues
        airplane value_pass_airplane = new airplane(100.0, 88.8);
        //we choose our values to pass in
        System.out.println("height = " + the_airplane.get_the_height());
        System.out.println("speed = " + the_airplane.get_the_speed());
        value_pass_airplane.change_the_height(8.0);
        System.out.println("height of value pass object = " + value_pass_airplane.get_the_height());
        System.out.println("speed of value pass object = " + value_pass_airplane.get_the_speed());

        try{
            System.out.println("hi");
            PrintWriter out = new PrintWriter("blah.txt");
            out.println("hi how are you doing");
            out.close();

            File inputFile = new File("blah.txt");
            Scanner in = new Scanner(inputFile);
            String a_line = in.nextLine();
            System.out.println("file contents: " + a_line); // + with strings is concatenation
            System.out.println("trying to read another line of the file...");
            a_line = in.nextLine(); 
            //int what = in.nextInt(); causes errors since file contains strings
            in.close();
            System.out.println("file contents: " + a_line); // + with strings is concatenation 
        }
        //catch(FielNotFoundException)
        //{
        //
        //}
        catch(Exception e)
        {
            System.out.println("error occurred: " + e.getMessage());
        }
    }
}
