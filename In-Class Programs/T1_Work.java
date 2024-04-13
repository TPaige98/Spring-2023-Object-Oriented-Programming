import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.Rectangle;

public class T1_Work
{
    public static void main(String [] args)
    {
        String name = ("Trevor Paige");
        System.out.println(name);

        double x = 8.88;
        String paige = Double.toString(x) + " | Last Name: Paige";
        System.out.println(paige);

        System.out.println();

        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a name");
            String trevor_paige = sc.nextLine();
            System.out.println("The name you entered was: " + trevor_paige);
        }
        catch(Exception e)
        {
            System.out.println("error ocurred: " + e.getMessage());
        }

        System.out.println();

        Rectangle table = new Rectangle(10, 15, 25, 35);
        System.out.print(table.getX() + ", " + table.getY() + ", " + table.getWidth() + ", " + table.getHeight());

        System.out.println();
        System.out.println();

        Rectangle rug = new Rectangle(14, 32, 85, 50);
        String xCoord = "" + rug.getX();
        String yCoord = "" + rug.getY();
        String width = "" + rug.getWidth();
        String height = "" + rug.getHeight();
        String paige_trevor = ("x = " + xCoord + " | y = " + yCoord + " | width = " + width + " | height = " + height + " | Name = Trevor Paige");
        System.out.println(paige_trevor);
    }
}
