public class airplane 
{
    private double height; private double speed; //member variables are private

    //constructor: scope is public
    public airplane()
    {
        height = 1.0; speed = 0.0;
    }   
    public airplane(double the_height, double the_speed)
    {
        height = the_height; speed = the_speed;
    } 

    //methods(functions): scope is public
    //mutators methods. generally one per variable.
    public void change_the_height(double the_new_height)
    {
        height = the_new_height;
    }
    public void change_the_speed(double the_new_speed)
    {
        speed = the_new_speed;
    }

    //accessor functions or methods:
    public double get_the_height()
    {
        return height;
    }
    public double get_the_speed()
    {
        return speed;
    }
}
