//an object to be instanciated
public class blah 
{
    private int x; private int y;

    public blah() // default constructor
    {
        x = 0; y = 0;
    }
    public blah(int a, int b) //value pass constructor
    {
        x = a; y = b;
    }

    //accessor methods for the member variable: return type matches that of the member variable accessed
    public int get_some_variable()
    {
        return x;
    }
    public int get_some_other_variable()
    {
        return y;
    }

    //mutator methods for the member variables: change the state of class, by variable content changes
    //typically return type is void, ensures atomicity of method or changes. 
    //most crashes happen in input output, so separate those from the methods that
    //change the state of the class. 
    public void change_some_variable()
    {
        x = x + 1; //change variable x to be an accumulator
    }
    public void change_some_other_variable(int the_value)
    {
        y = the_value; //data type matches that of the member variable to be changed. 
    }
}
