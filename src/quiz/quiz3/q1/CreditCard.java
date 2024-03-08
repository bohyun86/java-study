package quiz.quiz3.q1;

public class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println("신용카드로 10000원 결제되었습니다.");
    }
}
