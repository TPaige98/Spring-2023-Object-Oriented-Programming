public class bankaccount
{
    private double the_balance;
    public bankaccount() //default constructor
    {
        the_balance = 0.0;
    }
    public bankaccount(double amount) //value pass constructor
    {
        the_balance = amount;
    }
    public void deposit(double amount)
    {
        the_balance = the_balance + amount;
    }

    public void withdraw(double amount)
    {
        the_balance = the_balance - amount;
    }

    public double get_balance()
    {
        return the_balance;
    }
} //end of bankaccount class
