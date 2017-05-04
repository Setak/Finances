/**
 * Created by PaulM on 5/1/2017.
 */
public class Account {

    private float checkingAcct;                                                                                         // Initializes private float variable for Checking Account
    private float savingsAcct;                                                                                          // Initializes private float variable for Savings Account
    private float totalAcct;                                                                                            // Initializes private float variable for Account Totals when Checking and Savings are added

    public float getCheckingAcct() {                                                                                    // Starts Getter for checkingAcct
        return checkingAcct;                                                                                            // returns checkingAcct variable to be used in Main
    }                                                                                                                   // Ends Getter for checkingAcct

    public void setCheckingAcct(float newCheckingAcct) {                                                                // Starts Setter for checkingAcct
        checkingAcct = newCheckingAcct;                                                                                 // assigns the float captured from Main to the checkingAcct variable
    }                                                                                                                   // Ends Setter for checkingAcct

    public float getSavingsAcct() {                                                                                     // Starts Getter for savingsAcct
        return savingsAcct;                                                                                             // returns savingsAcct variable to be used in Main
    }                                                                                                                   // Ends Getter for savingsAcct

    public void setSavingsAcct(float newSavingsAcct) {                                                                  // Starts Setter for savingsAcct
        savingsAcct = newSavingsAcct;                                                                                   // assigns the float captured from Main to the savingsAcct variable
    }                                                                                                                   // Ends Setter for savingsAcct

    public float getTotalAcct() {                                                                                       // Starts Getter for totalAcct
        return totalAcct;                                                                                               // returns totalAcct variable to be used in Main
    }                                                                                                                   // Ends Getter for totalAcct

    public void setTotalAcct(float newTotalAcct) {                                                                      // Starts Setter for totalAcct
        totalAcct = newTotalAcct;                                                                                       // assigns the float captured from Main to the totalAcct variable
    }                                                                                                                   // Ends Setter for totalAcct

}
