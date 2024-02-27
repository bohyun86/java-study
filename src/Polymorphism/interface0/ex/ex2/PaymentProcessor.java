package Polymorphism.interface0.ex.ex2;

public class PaymentProcessor {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        BankTransfer bankTransfer = new BankTransfer();
        MobilityPay mobilityPay = new MobilityPay();

        Payment[] payments = {creditCard, bankTransfer, mobilityPay};

        int[] payAmount = {10000,20000,15000};

        for (int i = 0;i < payments.length; i++) {
            int amount = payAmount[i];
            payments[i].pay(amount);
        }
    }
}
