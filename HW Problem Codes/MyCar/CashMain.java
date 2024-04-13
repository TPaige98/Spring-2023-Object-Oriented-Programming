public class CashMain 
{
    public static void main(String [] args)
    {
        System.out.println("---------- NUMBER 6 ----------");

        CashRegister the_cash_register = new CashRegister();

        the_cash_register.receivePayment(8, 10, 15, 5, 10);

        double result = the_cash_register.get_payment();
        System.out.println("Total in Register = " + result);

        System.out.println();
    }
}
