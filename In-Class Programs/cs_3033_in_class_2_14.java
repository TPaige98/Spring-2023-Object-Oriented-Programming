public class cs_3033_in_class_2_14 
{
    public static void main(String [] args)
    {
        String my_string1 = "hello";
        String my_string2 = "hello";
        String my_string3 = "there";
        boolean result = (my_string2 == my_string2);

        System.out.println("result of == is, with same strings, " + result);
        int integer_result = my_string2.compareTo(my_string2);
        System.out.println("result of compareTo with same strings is " + integer_result);

        System.out.println();

        System.out.println("string1 == string2 result is.... " + (my_string1 == my_string2));
        System.out.println("string1.compareTo string2 is.... " + my_string1.compareTo(my_string2));

        System.out.println();

        System.out.println("my_string1 == my_string3 result is.... " + (my_string1 == my_string3));
        System.out.println("my_string1 == my_string3 result is.... " + my_string1.compareTo(my_string3));
        System.out.println("my_string1.compareTo my_string3 is.... " + my_string1.compareTo("hi"));
        /////////////////////////////////////////////////////
        System.out.println();
        char ch = my_string1.charAt(0);
        System.out.println("ch = " + ch);

        for(int i=0; i < my_string1.length(); i++)
        {
            char temp = my_string1.charAt(i);
            System.out.println("letter " + temp + " is at position " + i + " in the string");
        }

        System.out.println();
        int j = 0;
        for(; j < my_string1.length(); j++)
        {
            char temp = my_string1.charAt(j);
            System.out.println("letter " + temp + " is at position " + j + " in the string");
        }

        System.out.println();
        System.out.println("using a for loop with no initial and middle conditions, and break statement");
        System.out.println();
        j = 0;
        for( ; ; j++)
        {
            if(j == my_string3.length())
            {
                break;
            }
            char temp = my_string3.charAt(j);
            System.out.println("letter " + temp + " is at position " + j + " in the string");
        }

        System.out.println();
        System.out.println("using a for loop with no conditions, and break statement");
        System.out.println();
        j = 0;
        for( ; ; )
        {
            if(j == my_string3.length())
            {
                break;
            }
            char temp = my_string3.charAt(j);
            System.out.println("letter " + temp + " is at position " + j + " in the string");
            j++;
        }
    }   
}
