public class Order{
    private String orderNumber;
    private String item;
    private CardInfo customerCardInfo;
    private double totalPrice;

    

    public String getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public CardInfo getCustomerCardInfo() {
        return customerCardInfo;
    }
    public void setCustomerCardInfo(CardInfo customerCardInfo) {
        this.customerCardInfo = customerCardInfo;
    }
    
}