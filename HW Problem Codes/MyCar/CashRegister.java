public class CashRegister 
{
    private double payment;
    private coin new_coin;

    public CashRegister()
    {
        new_coin = new coin(0.01, 0.05, 0.10, 0.25, 1.00);
    }
    
    public void receivePayment(int Count1, int Count5, int Count10, int Count25, int Count100)
    {
        payment = payment + (Count1 * new_coin.getPennyVal()) + (Count5 * new_coin.getNickelVal())
        + (Count10 * new_coin.getDimeVal()) + (Count25 * new_coin.getQuartVal()) + (Count100 * new_coin.getDollVal());
    }

    public double get_payment()
    {
        return payment;
    }
}
