public class MyCarAssign7Num4 
{
    String MyCar = "Current Data for the Car";

    public class odoNum4 
    {
        private int odometer;
        public odoNum4() {odometer = 0;}
        public odoNum4(int odo_meter) {odometer = odo_meter;}
        public void get(int data) {odometer = data;}
        public int set() {return odometer;}
    }

    public class spdNum4
    {
        private int speed;
        public spdNum4() {speed = 0;}
        public spdNum4(int speed_meter) {speed = speed_meter;}
        public void get(int data) {speed = data;}
        public int set() {return speed;}
    }

    public class gearNum4
    {
        private int gear;
        public gearNum4() {gear = 0;}
        public gearNum4(int gear_current) {gear = gear_current;}
        public void get(int data) {gear = data;}
        public int set() {return gear;}
    }
}
