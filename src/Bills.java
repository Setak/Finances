/**
 * Created by PaulM on 5/2/2017.
 */
public class Bills {

    private double billExpense;
    // Set private variable for the cost of the bill, billExpense
    private String billName;
    // Set private variable for the name of the bill, billName
    private double billTotal;
    // Set private variable for the total of all the bills stored

    public double getBillTotal() {
        return billTotal;
        // returns the billTotal variable to be called from Main
    }

    public void setBillTotal(double newBillTotal) {
        this.billTotal = newBillTotal;
        // Sets the billTotal variable to the passed in Double through Main
    }

    public double getBillExpense() {
        return billExpense;
        // returns the billExpense variable to be called from Main
    }

    public String getBillName() {
        return billName;
        // returns the billName variable to be called in Main
    }

    public void setBill(double newBillExpense, String newBillName) {
        this.billExpense = newBillExpense;
        // Sets the billExpense variable based on the double captured in Main
        this.billName = newBillName;
        // Sets the billName variable based on the string captured in Main
    }

}