public interface PaymentProcessor {
  boolean authorizePayment(double amount, CardInfo cardInfo);
}
