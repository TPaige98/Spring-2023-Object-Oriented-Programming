//Trevor Paige
//Assignment 3: Part 2
public class MyCarTest
{
    public static void main(String [] args)
    {
        MyCar the_car = new MyCar(); //default constructor
        MyCar value_car = new MyCar(0.0, 0.0, 0);

        the_car.change_odometer(100583.9);
        the_car.change_Cspeed(50.5);
        the_car.change_Cgear(3);

        System.out.println("Odometer: " + the_car.get_odometer() + " mi/km");
        System.out.println("Speed: " + the_car.get_Cspeed() + " mph/kph");
        System.out.println("Gear: " + the_car.get_Cgear());

        value_car.change_odometer(100743.2);
        value_car.change_Cspeed(35.4);
        value_car.change_Cgear(2);

        System.out.println();

        System.out.println("New Odometer: " + value_car.get_odometer() + " mi/km");
        System.out.println("New Speed: " + value_car.get_Cspeed() + " mph/kph");
        System.out.println("New Gear: " + value_car.get_Cgear());
    }    
}
