//Trevor Paige
//Assignment 3: Part 2
public class MyCar 
{  
   //member variables
   private double odometer;
   private double Cspeed;
   private int Cgear;

   //constructor
   public MyCar()
   {odometer = 0.0; Cspeed = 0.0; Cgear = 0;}

   public MyCar(double distance, double speed, int gear)
   {odometer = distance; Cspeed = speed; Cgear = gear;}

   //mutators and accessor methods
   public void change_odometer(double new_distance) 
   {odometer = new_distance;} 

   public void change_Cspeed(double new_speed) 
   {Cspeed = new_speed;} 

   public void change_Cgear(int new_gear) 
   {Cgear = new_gear;} 

   public double get_odometer() 
   {return odometer;} 

   public double get_Cspeed() 
   {return Cspeed;} 

   public int get_Cgear() 
   {return Cgear;} 
   
}
