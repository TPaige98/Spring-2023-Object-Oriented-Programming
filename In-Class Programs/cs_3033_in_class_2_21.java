import java.util.HashMap;
import java.util.Random;

public class cs_3033_in_class_2_21 
{
    public static void main(String [] args)
    {
        System.out.println("Random Number Code");
        System.out.println();

        Random r = new Random(); //pseudorandom
        System.out.println(r.nextInt(6)); //modulus 6, which is 0-5
        System.out.println(r.nextInt(6) + 1); //modulus 6, which is 0-5, then add 1

        System.out.println();

        for(int i = 0; i < 50; i++)
        {
            System.out.print(r.nextInt() + " ");
        }

        System.out.println();
        System.out.println();

        for(int i = 0; i < 10; i++)
        {
            System.out.print(r.nextInt() + ", ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        System.out.println("HashMap Code");
        System.out.println();

        HashMap <String,String> hm = new HashMap<String,String>();
        hm.put("blah", "2");
        String result = (String)hm.get("blah");
        System.out.println("result = "  + result);
        //hm.put(new Integer(8), "8"); //we type constrained it at declaration so this won't work.
        
        HashMap <String,Integer> a_hashmap = new HashMap<String,Integer>();
        a_hashmap.put("huh", 3); //int 3 is upconverted to Integer wrapper class
        int x = a_hashmap.get("huh");
        System.out.println("x = " + x);

        int a = 8;
        a_hashmap.put("ate" , a);
        int wow = a_hashmap.get("ate");
        System.out.println("wow = " + wow);
    } 
}
