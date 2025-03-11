package be.heh.dst.pms.application.model;

public class BankTransferPayment extends PaymentMode {
    private String iban;

    public BankTransferPayment(String accountHolder, String iban) {
        super(accountHolder);
        this.iban = iban;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payement par carte de crédit de " + amount + " EUR");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("IBAN: " + iban);
    }
}

