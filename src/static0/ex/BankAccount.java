package static0.ex;

public class BankAccount {
    private int accountID;
    private int balance;
    static int accountCount = 0;


    public BankAccount() {
        accountCount++;
        accountID = accountCount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public int getBalance() {
        return balance;
    }



    public void accountInfo() {
        System.out.println("계좌 " + accountID + ": 계좌 ID=" + accountID + ", "+ "잔액=" + getBalance());
    }

    public static void accountCountInfo() {
        System.out.println("전체 계좌 수: " + accountCount);;
    }
}
