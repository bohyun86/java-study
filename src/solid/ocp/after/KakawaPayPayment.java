package solid.ocp.after;

public class KakawaPayPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("카카와페이로 결제합니다.");
    }
}
