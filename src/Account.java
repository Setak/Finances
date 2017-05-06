/**
 * Created by PaulM on 5/1/2017.
 */
public class Account {

    private double checkingAcct;                                                                                        // Initializes private variable for Checking Account
    private double savingsAcct;                                                                                         // Initializes private variable for Savings Account
    private double totalAcct;                                                                                           // Initializes private variable for Account Totals when Checking and Savings are added

    public double getCheckingAcct() {                                                                                   // Starts Getter for checkingAcct
        return checkingAcct;                                                                                            // returns checkingAcct variable to be used in Main
    }                                                                                                                   // Ends Getter for checkingAcct

    public void setCheckingAcct(double newCheckingAcct) {                                                               // Starts Setter for checkingAcct
        this.checkingAcct = newCheckingAcct;                                                                                 // assigns the float captured from Main to the checkingAcct variable
    }                                                                                                                   // Ends Setter for checkingAcct

    public double getSavingsAcct() {                                                                                    // Starts Getter for savingsAcct
        return savingsAcct;                                                                                             // returns savingsAcct variable to be used in Main
    }                                                                                                                   // Ends Getter for savingsAcct

    public void setSavingsAcct(double newSavingsAcct) {                                                                 // Starts Setter for savingsAcct
        this.savingsAcct = newSavingsAcct;                                                                                   // assigns the float captured from Main to the savingsAcct variable
    }                                                                                                                   // Ends Setter for savingsAcct

    public double getTotalAcct() {                                                                                      // Starts Getter for totalAcct
        return totalAcct;                                                                                               // returns totalAcct variable to be used in Main
    }                                                                                                                   // Ends Getter for totalAcct

    public void setTotalAcct(double newTotalAcct) {                                                                     // Starts Setter for totalAcct
        this.totalAcct = newTotalAcct;                                                                                       // assigns the float captured from Main to the totalAcct variable
    }                                                                                                                   // Ends Setter for totalAcct

}
