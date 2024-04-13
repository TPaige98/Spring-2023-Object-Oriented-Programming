public class MyCarAssign7Num4Test 
{
    public static void main(String[] args)
    {
        MyCarAssign7Num4 the_car = new MyCarAssign7Num4();
        MyCarAssign7Num4.odoNum4 odo = the_car.new odoNum4(100000);
        MyCarAssign7Num4.spdNum4 spd = the_car.new spdNum4(44);
        MyCarAssign7Num4.gearNum4 gear = the_car.new gearNum4(3);

        System.out.println(the_car.MyCar);
        System.out.println("Odometer Reads: " + odo.set());
        System.out.println("Speed Reads: " + spd.set());
        System.out.println("Gear Reads: " + gear.set());
    }
}
