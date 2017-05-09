/**
 * Created by PaulM on 5/1/2017.
 */
public class Account {

    private double checkingAcct;
    // Initializes private variable for Checking Account
    private double savingsAcct;
    // Initializes private variable for Savings Account
    private double totalAcct;
    // Initializes private variable for Account Totals when Checking and Savings are added

    public double getCheckingAcct() {
        return checkingAcct;
        // returns checkingAcct variable to be used in Main
    }

    public void setCheckingAcct(double newCheckingAcct) {
        this.checkingAcct = newCheckingAcct;
        // assigns the float captured from Main to the checkingAcct variable
    }

    public double getSavingsAcct() {
        return savingsAcct;
        // returns savingsAcct variable to be used in Main
    }

    public void setSavingsAcct(double newSavingsAcct) {
        this.savingsAcct = newSavingsAcct;
        // assigns the float captured from Main to the savingsAcct variable
    }

    public double getTotalAcct() {
        return totalAcct;
        // returns totalAcct variable to be used in Main
    }

    public void setTotalAcct(double newTotalAcct) {
        this.totalAcct = newTotalAcct;
        // assigns the float captured from Main to the totalAcct variable
    }

}
