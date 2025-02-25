package be.heh.dst.pms;

public class CreditCardPayment extends PaymentMode {

    private String cardNumber;

    public CreditCardPayment(String accountHolder, String cardNumber) {
        super(accountHolder);
    }
    public void processPayment(double amount){

    }
}
