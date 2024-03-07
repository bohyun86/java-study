package library.lang.ex.ex1;

public class Ex1 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("45678-4567","홍길동",1000000);
        System.out.println(bankAccount);
    }
}

class BankAccount {
    String accountNum;
    String name;
    int amount;

    public BankAccount(String accountNum, String name, int amount) {
        this.accountNum = accountNum;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "계좌번호: %s\n이름: %s\n잔액: %d".formatted(accountNum, name, amount);
    }
}
