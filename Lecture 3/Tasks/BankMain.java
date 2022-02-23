package lecture3;

public class BankMain {
    public static void main(String[] args) {
        BankModified bank = new BankModified();
        bank.checkBalance();
        bank.deposit(10000);
        bank.checkBalance();
        bank.deposit(1000);
        bank.checkBalance();
        bank.withdraw(700);
        bank.checkBalance();
        bank.withdraw(500);
        bank.checkBalance();
        bank.withdraw(501);
        bank.checkBalance();
    }
}
