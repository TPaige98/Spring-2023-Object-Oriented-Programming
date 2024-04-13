import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Assign8Num1 
{
    public static void main(String[] args)
    {
        try
        {
            PrintWriter out = new PrintWriter("output.txt");
            ArrayList<Integer> Num100 = new ArrayList<Integer>();

            for(int i = 0; i < 100; i++)
            {
                Num100.add(i);
            }

            for(int i = 0; i < Num100.size(); i++)
            {
                out.print((i + 1) + " ");
            }
            out.close();

            File inputFile = new File("output.txt");
            Scanner in = new Scanner(inputFile);
            String a_line = in.nextLine();
            System.out.println("File contents: " + a_line);
            in.close();
        }

        catch(HW8Num2Exception e)
        {
            System.out.println("Error Occurred: " + e);
        }

        catch(FileNotFoundException e)
        {
            System.out.println("Error Occurred: " + e);
        }
    }
}
