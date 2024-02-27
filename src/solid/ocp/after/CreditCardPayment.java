package solid.ocp.after;

public class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("신용카드로 결제합니다.");
    }
}
