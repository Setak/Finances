/**
 * Created by PaulM on 5/2/2017.
 */
public class Bills {

    private double billExpense;
    private String billName;
    private double billTotal;

    public double getBillTotal() {
        return billTotal;
    }

    public void setBillTotal(double newBillTotal) {
        billTotal = newBillTotal;
    }

    public double getBillExpense() {
        return billExpense;
    }

    public String getBillName() {
        return billName;
    }

    public void setBill(double newBillExpense, String newBillName) {
        billExpense = newBillExpense;
        billName = newBillName;
    }

}