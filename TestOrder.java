public class TestOrder{
    public static void main(String[] args){

        Order myOrder = new Order();

        PaymentProcessor mPaymentProcessor = new EWalletPaymentGateway();

        OrderProcessor orderProcessor = new OrderProcessor(mPaymentProcessor);

        orderProcessor.processOrder(myOrder);
        



    }
}