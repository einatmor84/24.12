public class Main {
    public static void main(String[] args) {
        BankAccount savingAccount = new SavingAccount("SA001", 500);
        BankAccount currentAccount = new CurrentAccount("YT501", 20000);

        double amount = 800;
        savingAccount.withdraw(amount);
        savingAccount.deposit(amount);
        savingAccount.withdraw(amount);

    }
}