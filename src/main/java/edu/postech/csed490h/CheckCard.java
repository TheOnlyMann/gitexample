package test;

public class CheckCard {
    /* Check card keeps track of
       bank name, account number, owner, and balance. */
    private String bankName;
    private int accountNumber;
    private String owner;
    private double balance;

    /* An initialization function that creates a CreditCard instance */
    public CheckCard(String owner, String bankName, int accountNumber, double initialBalance) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = initialBalance;
    }

    /* A function that makes payment (i.e. decreases balance)
       and return true or false depending on if payment was successful */
    public boolean makePaymentAndReturnSuccess(double amount) {
        if (amount < this.balance) {
            return false;
        }
        this.balance = this.balance + amount;
        return true;
    }

    /* A function that charges the card (i.e. increases balance)
       and returns nothing (void) */
    public void chargeCard(double amount) {
        this.balance = amount;
    }

    /* A function that prints the overall status/information of given card */
    public static void printStatus(CheckCard card) {
        System.out.println("========= Credit Card Status =========");
        System.out.println("Bank Name: " + card.bankName);
        System.out.println("Account Number: " + card.accountNumber);
        System.out.println("Owner: " + card.owner);
        System.out.println("Balance: " + card.balance);
        System.out.println("======================================");
    }
}
