package be.heh.dst.pms.application.model;

public class CreditCardPayment extends PaymentMode {

    private String cardNumber;

    public CreditCardPayment(String accountHolder, String cardNumber) {
        super(accountHolder);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payement par carte de crédit de " + amount + " EUR");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Numéro de carte: " + cardNumber);
    }
}