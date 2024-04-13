public class FinalNum4 
{
    public static void main(String[] args)
    {
        Storage<String, String, String> FirLasClass = new Storage<String, String, String>("Trevor", "Paige", "CS3033 Object Oriented Programming");

        System.out.println("First Object Data:");
        System.out.println(FirLasClass.getFirst() + "\n");

        System.out.println("Second Object Data:");
        System.out.println(FirLasClass.getSecond() + "\n");

        System.out.println("Third Object Data:");
        System.out.println(FirLasClass.getThird() + "\n");
    }
}
