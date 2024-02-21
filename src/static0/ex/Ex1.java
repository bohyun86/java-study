package static0.ex;

public class Ex1 {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        bankAccount1.deposit(1000);
        bankAccount2.deposit(2000);
        bankAccount1.accountInfo();
        bankAccount2.accountInfo();
        BankAccount.accountCountInfo();


    }
}
