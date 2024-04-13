public class MyCarHW8Main 
{
    public static void main(String[] args)
    {
        Storage<Double, Double, Integer> MyCar1 = new Storage<Double, Double, Integer>(150.2, 32.5, 4);
        Storage<Double, Double, Integer> MyCar2 = new Storage<Double, Double, Integer>(15.23, 34.2,4);
        Storage<Double, Double, Integer> MyCar3 = new Storage<Double, Double, Integer>(23.4, 5.5, 1);

        System.out.println("MyCar1 Data");
        System.out.println("Odometer: " + MyCar1.getFirst() + "\nSpeed: " + MyCar1.getSecond()
        + "\nGear: " + MyCar1.getThird());

        System.out.println();
        System.out.println("MyCar2 Data");
        System.out.println("Odometer: " + MyCar2.getFirst() + "\nSpeed: " + MyCar2.getSecond()
        + "\nGear: " + MyCar2.getThird());

        System.out.println();
        System.out.println("MyCar3 Data");
        System.out.println("Odometer: " + MyCar3.getFirst() + "\nSpeed: " + MyCar3.getSecond()
        + "\nGear: " + MyCar3.getThird());

    }
}
