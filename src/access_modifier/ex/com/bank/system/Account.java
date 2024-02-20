package access_modifier.ex.com.bank.system;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void getBalance() {
        System.out.println("현재 잔액: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("입금 후 잔액: " + balance);
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("출금 시도: " + amount);
            System.out.println("출금 실패. 잔액 부족");
        } else {
            balance -= amount;
            System.out.println("출금 후 잔액: " + balance);
        }
    }



}
