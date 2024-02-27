package Polymorphism.interface0.ex.ex2;

public class CreditCard implements Payment {
    @Override
    public void pay(int payment) {
        System.out.printf("신용카드로 %d원 결제되었습니다.\n",payment);
    }
}
