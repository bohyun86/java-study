package access_modifier.ex.com.bank.system;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(0);
        account.getBalance();
        account.deposit(100);
        account.withdraw(50);
        account.withdraw(100);
    }
}
