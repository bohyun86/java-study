package quiz.quiz3.q1;

public class MobilePay implements Payment {
    @Override
    public void pay() {
        System.out.println("모바일 결제로 10000원 결제되었습니다.");
    }
}
