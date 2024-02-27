package Polymorphism.interface0.ex.ex2;

public class MobilityPay implements Payment {
    @Override
    public void pay(int payment) {
        System.out.printf("모바일 결제로 %d원 결제되었습니다.\n",payment);
    }
}
