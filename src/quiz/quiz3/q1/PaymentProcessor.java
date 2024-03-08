package quiz.quiz3.q1;

public class PaymentProcessor {
    Payment[] pays;

    public PaymentProcessor(Payment[] pay) {
        this.pays = pay;
    }

    void paymentMethod() {
        for (Payment pay:pays) {
            pay.pay();
        }
    }
}
