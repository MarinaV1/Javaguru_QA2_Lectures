package lecture2;

public class Bank {

    private int bankBalance = 0;

    public void deposit(int amount) {
        bankBalance = bankBalance + amount;
        System.out.println("You have deposited " + amount + " euros");
    }

    public void withdraw(int amount) {
        bankBalance = bankBalance - amount;
        System.out.println("You have " + amount + " euros on your bank account");
    }

    public void checkBalance() {
        System.out.println("You have " + bankBalance + " euros on your bank account");
    }
}
