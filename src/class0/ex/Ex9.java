package class0.ex;

public class Ex9 {
    public static void main(String[] args) {
        /*
        문제: 간단한 은행 계좌 관리 시스템 설계
        목표: 은행 계좌의 기본적인 기능을 제공하는 간단한 계좌 관리 시스템을 설계하세요. 계좌의 생성, 입금, 출금, 잔액 조회 기능을 구현합니다.

        1단계: 계좌 클래스(BankAccount) 정의
        속성: 계좌번호(accountNumber), 소유자 이름(ownerName), 잔액(balance)
        기능:
        입금(deposit): 잔액에 특정 금액을 추가합니다.
        출금(withdraw): 잔액에서 특정 금액을 차감합니다. 잔액이 출금하려는 금액보다 적을 경우 출금을 할 수 없습니다.
        잔액 조회(getBalance): 현재 잔액을 출력합니다.
         */
        // 계좌 생성
        BankAccount bankAccount = new BankAccount("1111-1111","정찬성");

        // 입금
        bankAccount.deposit(10000);

        // 출금
        bankAccount.withdraw(5000);

        // 잔액 초과 출금
        bankAccount.withdraw(10000);

        // 현재 잔액 조회
        bankAccount.getBalance();

    }
}