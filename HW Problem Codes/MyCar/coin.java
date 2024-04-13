public class coin 
{
    private double penny, nickel, dime, quarter, dollar;

    public coin()
    {penny = 0.0; nickel = 0.0; dime = 0.0; quarter = 0.0; dollar = 0.0;}

    public coin(double pennyVal, double nickelVal, double dimeVal, double quartVal, double dollVal)
    {penny = pennyVal; nickel = nickelVal; dime = dimeVal; quarter = quartVal; dollar = dollVal;}

    public double getPennyVal()
    {return penny;}
    
    public double getNickelVal()
    {return nickel;}

    public double getDimeVal()
    {return dime;}

    public double getQuartVal()
    {return quarter;}

    public double getDollVal()
    {return dollar;}
    
}
