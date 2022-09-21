/*
. Write a class SavingsAccount that is similar to the BankAccount class, except that it
has an added instance variable interest. Supply a constructor that sets both the
initial balance and the interest rate. Supply a method addInterest (with no explicit
parameter) that adds interest to the account. Write a SavingsAccountTester class
that constructs a savings account with an initial balance of $1,000 and an interest
rate of 10 percent. Then apply the addInterest method and print the resulting
balance. Also compute the expected result by hand and print it
 */
public class SavingsAccountTester {
    public static void main(String[] args) {
        SavingsAccount ac = new SavingsAccount(50000 ,10);
        ac.addInterest();
        System.out.println("the expected : 100000");
        System.out.println("the resulting balance :" + ac.getBalance());

      //  ******************* THE CLASS ***********************   //
        /*
        public class SavingsAccount {
              private double balance;
              private double interest;

    public SavingsAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest; }

    public void addInterest(){
        balance=balance+( (balance*interest) /100 );}

    public double getBalance(){
        return balance; }
}
         */
    }
}
