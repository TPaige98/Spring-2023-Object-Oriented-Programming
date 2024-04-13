public class cs_3033_3_7_main 
{
    public static void main(String [] args)
    {
        cs_3033_in_class_3_7_cont wow = new cs_3033_in_class_3_7_cont();
        cs_3033_in_class_3_7_cont value_of_wow = new cs_3033_in_class_3_7_cont(8, 9);
        value_of_wow.change_something_in_the_object();
        int the_result = value_of_wow.get();
        int result = wow.get();
        System.out.println("result = " + the_result);
        System.out.println("result = " + result);
    }    
}
