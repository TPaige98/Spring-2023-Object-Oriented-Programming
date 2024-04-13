public class speedAssign7 implements Parts
{
    private int speed;

    public speedAssign7()
    {
        speed = 0;
    }

    public speedAssign7(int speed_meter)
    {
        speed = speed_meter;
    }

    public void get(int data) 
    {
        speed = data;
    }

    public int set() 
    {  
        return speed;
    }
    
}
