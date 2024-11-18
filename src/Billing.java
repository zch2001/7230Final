import java.util.Date;

// Billing Class
class Billing {
    private int billingID;
    private double amount;
    private Date dueDate;
    private String status;

    public void generateInvoice() {
        System.out.println("Generating invoice with billingID: " + billingID);
    }

    public void processPayment() {
        System.out.println("Processing payment for billingID: " + billingID);
    }

    public void checkStatus() {
        System.out.println("Billing status: " + status);
    }

    public void applyLateFee() {
        System.out.println("Applying late fee for billingID: " + billingID);
    }
}