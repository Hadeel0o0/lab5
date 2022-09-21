/*
 Add a method public void addInterest(double rate) to the BankAccount class that
adds interest at the given rate. For example, after the statements
BankAccount momsSavings = new BankAccount(1000);
momsSavings.addInterest(10); // 10 percent interest...ect
 */
public class BankAccountTester2 {
    public static void main(String[] args) {
        BankAccount bank2= new BankAccount(1000);
        bank2.addInterest(10);

        System.out.println("the expected result  :");
               System.out.println( "1,100" );
        System.out.println("the actual balance :");
               System.out.println( bank2.getBalance() );

//               ****  the method in BankAccount ****
//        public void addInterest(double rate)
//        {
//            balance=balance+( (balance*rate) /100 );
//        }


    }
}
