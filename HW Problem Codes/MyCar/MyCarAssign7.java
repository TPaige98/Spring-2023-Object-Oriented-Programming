public class MyCarAssign7
{
    public static void main(String [] args)
    {
        odometerAssign7 odometer = new odometerAssign7(0);
        speedAssign7 speed = new speedAssign7(0);
        gearAssign7 gear = new gearAssign7(0);

        odometer.get(10000);
        speed.get(50);
        gear.get(3);

        System.out.println("Odometer Reads: " + odometer.set());
        System.out.println("Speed Reads: " + speed.set());
        System.out.println("Gear Reads: " + gear.set());
    }
}
