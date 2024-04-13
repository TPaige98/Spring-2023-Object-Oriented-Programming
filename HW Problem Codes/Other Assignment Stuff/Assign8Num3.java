import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Assign8Num3 
{
    public static void main(String [] args)
    {
        try
        {
            FileReader out = new FileReader("output.txt");
            int output = out.read();

            System.out.print("File Contents: ");

            while(output != -1)
            {
                System.out.print((char)output);
                output = out.read();
            }
            out.close();
        }

        catch(HW8Num2Exception e)
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
