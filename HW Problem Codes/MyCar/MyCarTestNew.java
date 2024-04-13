public class MyCarTestNew
{
    public static void main(String [] args)
    {
       MyCarNew the_car = new MyCarNew();

       the_car.receiveOdo(0.0);
       the_car.receiveSpeed(0.0);
       the_car.receiveGear(0);

       double odo_result = the_car.get_odometer();
       double speed_result = the_car.get_speed();
       int gear_result = the_car.get_gear();

       System.out.println("Odometer Reads: " + odo_result);
       System.out.println("Speed Reads: " + speed_result);
       System.out.println("Gear Reads: " + gear_result);

    }    

}
