public class cs3033_1_19 
{
    private int a_value;
    //constructor: want at least two of them. One default and one for passing values in. 
    //have the same name as the class.
    //for each variable we want two functions (called methods)
    //one is used to change(mutator) and one used to get a copy of variable(accessor)

    public cs3033_1_19()
    {
        //default: choose your own.
        a_value = 1;
    }
    public cs3033_1_19(int starting_value)
    {
        a_value = starting_value;
    }

    //we control how or if the member variable (a_value) is changed externally. 
    //encapsulation achieved this way: private member variables, mutators with non-private scope

    //data integrity is more likely to be preserved (records, variable contents, etc.)
    //using object oriented programming methodology. 

    //mutator to change the state of the class/object
    //typically return type of void

    public void change_the_variable(int what)
    {
        a_value = what;
    }

    //accessor to get a copy of the member variable (copy of a part of the state of the object)
    //return type to match member variable. const would be added in C++

    public int get_a_copy_of_the_variable()
    {
        return a_value;
    }
}
    //booch, rumbaugh, jacobson. Wrote book on object oriented programming.  