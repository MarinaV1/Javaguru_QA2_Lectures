package lecture2;

public class Exercise2 {

    public static void main(String[] args) {
        Bank bankVariable = new Bank();
        bankVariable.checkBalance();
        bankVariable.deposit(1000);
        bankVariable.checkBalance();
        bankVariable.withdraw(100);
        bankVariable.checkBalance();
    }

}
