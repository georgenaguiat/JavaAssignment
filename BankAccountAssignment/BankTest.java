package BankAccountAssignment;

public class BankTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        System.out.println("Number of accounts: " + BankAccount.getAccounts());
        System.out.println("Total money: " + BankAccount.getTotalMoney());

        account1.deposit("checking", 1000);
        account1.deposit("savings", 500);

        account2.deposit("checking", 2000);
        account2.deposit("savings", 1000);

        System.out.println("Account 1 Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Account 1 Savings Balance: " + account1.getSavingsBalance());
        System.out.println("Account 2 Checking Balance: " + account2.getCheckingBalance());
        System.out.println("Account 2 Savings Balance: " + account2.getSavingsBalance());

        account1.withdraw("checking", 300);
        account2.withdraw("savings", 800);

        System.out.println("Account 1 Total Balance: " + account1.getBalance());
        System.out.println("Account 2 Total Balance: " + account2.getBalance());
    }
}

