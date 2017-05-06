/**
 * Created by PaulM on 5/2/2017.
 */
public class Bills {

    private double billExpense;                                                                                         // Set private variable for the cost of the bill, billExpense
    private String billName;                                                                                            // Set private variable for the name of the bill, billName
    private double billTotal;                                                                                           // Set private variable for the total of all the bills stored

    public double getBillTotal() {                                                                                      // Start Getter for billTotal variable
        return billTotal;                                                                                               // returns the billTotal variable to be called from Main
    }                                                                                                                   // Ends Getter for billTotal variable

    public void setBillTotal(double newBillTotal) {                                                                     // Start Setter for billTotal
        this.billTotal = newBillTotal;                                                                                       // Sets the billTotal variable to the passed in Double through Main
    }                                                                                                                   // Ends Setter for billTotal

    public double getBillExpense() {                                                                                    // Start Getter for billExpense
        return billExpense;                                                                                             // returns the billExpense variable to be called from Main
    }                                                                                                                   // Ends Getter for billExpense

    public String getBillName() {                                                                                       // Start Getter for billName
        return billName;                                                                                                // returns the billName variable to be called in Main
    }                                                                                                                   // Ends Getter for billName

    public void setBill(double newBillExpense, String newBillName) {                                                    // Start Setter for setBill, which will take the values for the bill, name and cost, and get it ready to be added to the ArrayList Bills
        this.billExpense = newBillExpense;                                                                                   // Sets the billExpense variable based on the double captured in Main
        this.billName = newBillName;                                                                                         // Sets the billName variable based on the string captured in Main
    }                                                                                                                   // Ends Setter for setBill

}