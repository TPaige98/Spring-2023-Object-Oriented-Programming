import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinalNum3 
{
    public static void main(String[] args)
    {
        try
        {
            FileReader out = new FileReader("paige.txt");
            int output = out.read();
            System.out.print("File contents: ");

            for(int i = 0; i <= 290; i++)
            {
                System.out.print((char)output);
                output = out.read();
            }
            out.close();
        }

        catch(TrevorException e)
        {
            System.out.println("Error Occurred: " + e);
        }

        catch(FileNotFoundException e)
        {
            System.out.println("Error Occurred: " + e);
        }

        catch(IOException e)
        {
            System.out.println("Error Occurred: " + e);
        }
    }
}
