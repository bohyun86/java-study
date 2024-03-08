package quiz.quiz3.q1;

public class Main {
    public static void main(String[] args) {
        BankTransfer bankTransfer = new BankTransfer();
        CreditCard creditCard = new CreditCard();
        MobilePay mobilePay = new MobilePay();

        Payment[] pays = {creditCard, bankTransfer, mobilePay};

        PaymentProcessor paymentProcessor = new PaymentProcessor(pays);
        paymentProcessor.paymentMethod();

    }
}
