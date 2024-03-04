package exception;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(1000);
        System.out.println("예금액: " + account.getBalance());

        // 떠넘겨진 예외(체크 예외)를 처리
        try {
            account.withdraw(3000);
        } catch (InsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}
