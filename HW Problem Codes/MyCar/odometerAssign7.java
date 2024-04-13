public class odometerAssign7 implements Parts
{
    private int odometer;
    
    public odometerAssign7()
    {
        odometer = 0;
    }

    public odometerAssign7(int odo_meter)
    {
        odometer = odo_meter;
    }

    public void get(int data) 
    {
        odometer = data;
    }

    public int set() 
    {
        return odometer;
    }
    
}
