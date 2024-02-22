package static0.ex;

public class BankAccount1 {
    /* 은행 시스템
    계좌 Account 클래스
    필드는
    accountNumber 고유한 계좌번호
    ownerName 소유자 이름
    balance 잔액
    interestRate 불변 고정 이자

    // 생성자 : 3가지 필드 사용

    // 메서드 : 필드 내용을 출력하는 정보 출력 메서드
     */

    private final String ACCOUNT_NUMBER;
    private String ownerName;
    private long balance;
    private final double INTEREST_RATE = 0.05;

    public BankAccount1(String ACCOUNT_NUMBER, String ownerName, long balance) {
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void printInfo() {
        System.out.printf("계좌번호: %s, 소유자명: %s, 잔액: %d, 이자: %f\n", ACCOUNT_NUMBER, ownerName, balance, INTEREST_RATE);
    }
}
