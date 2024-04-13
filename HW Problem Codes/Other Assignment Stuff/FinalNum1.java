import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class FinalNum1 
{
    public static void main(String[] args)
    {
        try
        {
            PrintWriter out = new PrintWriter("paige.txt");
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

            File inputFile = new File("paige.txt");
            Scanner in = new Scanner(inputFile);
            String a_line = in.nextLine();
            System.out.println("File contents: " + a_line);
            in.close();
        }
        catch(Exception e)
        {
            System.out.println("error occurred: " + e.getMessage());
        }
    }
}
