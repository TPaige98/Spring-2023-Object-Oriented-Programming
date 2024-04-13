public class cs_3033_in_class_3_7_cont 
{
    private int something; private example my_example;
    public cs_3033_in_class_3_7_cont()
    {
        something = 1;
        my_example = new example(); //default constructor uses default constructor
            //object is instanciated in the constructor
    }    
    public cs_3033_in_class_3_7_cont(int start_something, int to_initialize_the_object)
    {
        something = start_something;
        my_example = new example(to_initialize_the_object); //default constructor uses default constructor
            //object is instanciated in the constructor
    }

    public int get(){return something;}
    public void set(int what) {something = what;}
    public void change_something_in_the_object()
    {
        my_example.change_variable(100);
    }
}
