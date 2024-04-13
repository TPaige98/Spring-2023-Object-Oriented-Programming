import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//core java volume 1 and 2 by Horstmann.

public class the_driver 
{
    public static void main(String [] args)
    {
        //file IO needs try catch. helps catch errors in keyboard IO.
        try
        {
            ArrayList<String> my_list = new ArrayList<String>();
            my_list.add("hello");
            my_list.add("there");
            System.out.println("printing contents of my_list");
            for(int i = 0; i<my_list.size(); i++)
            {
                System.out.println(my_list.get(i)); //get(i) is same as get[i] in c++
            }
            //add, set, get are the three methods used the most

            ArrayList<blah> my_list2 = new ArrayList<blah>();
            my_list2.add(new blah());
            my_list2.add(new blah(8, 9));
            my_list2.add(new blah(88, 98));
            my_list2.add(new blah(81, 91));
            my_list2.add(new blah(881, 911));

            for(int i = 0; i< my_list2.size(); i++)
            {
                System.out.print(my_list2.get(i).get_some_variable());
                System.out.print(", ");
                System.out.print(my_list2.get(i).get_some_other_variable());
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }  
}
