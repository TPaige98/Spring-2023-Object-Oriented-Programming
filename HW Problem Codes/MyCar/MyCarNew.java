//Trevor Paige
//Assignment 5
public class MyCarNew
{
  private double odometer;
  private double speed;
  private int gear;
  private Odometer new_odometer;
  private Speed new_speed;
  private Gear new_gear;

  public MyCarNew()
  {
    new_odometer = new Odometer(0.0);
    new_speed = new Speed(0.0);
    new_gear = new Gear(0);
  }

  public void receiveOdo(double odo_final) {odometer = odo_final + new_odometer.get_Codometer();}
  public void receiveSpeed(double speed_final) {speed = speed_final + new_speed.get_Cspeed();}
  public void receiveGear(int gear_final) {gear = new_gear.get_Cgear();}

  public double get_odometer() {return odometer;}
  public double get_speed() {return speed;}
  public int get_gear() {return gear;}
}