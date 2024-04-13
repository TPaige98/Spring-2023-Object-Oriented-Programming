public class test 
{
    public static void main(String [] args)
    {
        bankaccount the_bank_account = new bankaccount(); //default constructor
        double current_balance = the_bank_account.get_balance();
        the_bank_account.deposit(8999.0);
        the_bank_account.withdraw(8.0);
        current_balance = the_bank_account.get_balance();
        System.out.println(current_balance);
    }    
}
