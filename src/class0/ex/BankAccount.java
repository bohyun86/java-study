package class0.ex;

public class BankAccount {
    // 속성: 계좌번호(accountNumber), 소유자 이름(ownerName), 잔액(balance)
    String accountNumber;
    String ownerName;
    int balance = 0;

    public BankAccount(String a, String o) {
        accountNumber = a;
        ownerName = o;
    }

/*
    입금(deposit): 잔액에 특정 금액을 추가합니다.
    출금(withdraw): 잔액에서 특정 금액을 차감합니다. 잔액이 출금하려는 금액보다 적을 경우 출금을 할 수 없습니다.
            잔액 조회(getBalance): 현재 잔액을 출력합니다.
 */
    void deposit(int d) {
        balance += d;
        System.out.println(d + "원을 입금. 잔액은 " + balance + "원");
    }

    void withdraw(int w) {
        if (balance < w) {
            System.out.println("잔액이 출금하려는 금액보다 적어 출금할 수 없습니다.");
        } else {
            balance -= w;
            System.out.println(w + "원을 출금. 잔액은 " + balance + "원");
        }
    }

    void getBalance() {
        System.out.println("현재 잔액: " + balance);
    }

}
