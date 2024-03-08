package quiz.quiz3.q1;

public class BankTransfer implements Payment {
    @Override
    public void pay() {
        System.out.println("은행 이체로 10000원 결제되었습니다.");
    }
}
