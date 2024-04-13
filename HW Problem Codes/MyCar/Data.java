public class Data 
{
   private double odometer;
   private double Cspeed;
   private int Cgear;

   public Data(){odometer = 0.0; Cspeed = 0.0; Cgear = 0;}

   public Data(double distance, double speed, int gear)
   {odometer = distance; Cspeed = speed; Cgear = gear;}

   public double get_odometer()
   {return odometer;}
   public double get_Cspeed()
   {return Cspeed;}
   public int get_Cgear()
   {return Cgear;} 
}
