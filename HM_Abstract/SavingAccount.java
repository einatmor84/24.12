public class SavingAccount extends BankAccount{

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of: " + amount + " successful. \n current balance is: " + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance() >= amount){
            setBalance(getBalance() - amount);
            System.out.println("withdraw of: "  + amount + " successful. \n current balance is: " + getBalance());
        }
        else
        {
            System.out.println("withdraw failed. no balance");
        }
    }

}
