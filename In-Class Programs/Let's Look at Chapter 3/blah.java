//let's look at chapter 3
public class blah
{
    private int y;
    private double x;
    private int z; //make an internal variable not modifyable outside the class
    //make all your functions (methods) accessible to all: public scope
    //member variable: private (this way they are encapsulated)
    //change functions to change variable contents: mutator methods (functions)
    //functions to get copies of the variable contents: accessor function (method)
    
    public int get_z() {return z;} //accessor method (functions)
    public int get_y() {return y;} //accessor method (functions)
    public double get_x() {return x;} //accessor method (functions)
    public void change_y(int what) {y = what;} //mutator method (functions)
    public void change_x() {x = x + 1;} //mutator method (functions)
    public blah() {x = 1.0; y = 0; z = 8;} //default constructor
    public blah(double init_x, int init_y) {z = 8; x = init_x; y = init_y;} //value pass constructor
}