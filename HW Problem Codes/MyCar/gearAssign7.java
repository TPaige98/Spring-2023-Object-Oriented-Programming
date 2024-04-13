public class gearAssign7 implements Parts
{
    private int gear;

    public gearAssign7()
    {
        gear = 0;
    }

    public gearAssign7(int gear_current)
    {
        gear = gear_current;
    }

    public void get(int data) 
    {
        gear = data;
    }

    public int set() 
    {  
        return gear;
    }
}
