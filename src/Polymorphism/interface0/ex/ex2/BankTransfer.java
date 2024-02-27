package Polymorphism.interface0.ex.ex2;

public class BankTransfer implements Payment {
    @Override
    public void pay(int payment) {
        System.out.printf("은행 이체로 %d원 결제되었습니다.\n",payment);
    }
}
