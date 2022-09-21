/*. Write a BankAccountTester class whose main method constructs a bank account,
deposits $1,000, withdraws $500, withdraws another $400, and then prints the
remaining balance. Also print the expected result.
*/
public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bank= new BankAccount();
        bank.deposit(1000);
        bank.withdraw(500);
        bank.withdraw(400);

        System.out.println("the expected result  :");
        System.out.println( "100" );
        System.out.println("the remaining balance :");
        System.out.println( bank.getBalance() );

    }
}
