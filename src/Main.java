/**
 * Created by Paul.Kates on 5/1/2017.
 */
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Account checkingAcct = new Account();
        Account savingsAcct = new Account();
        Account totalAcct = new Account();
        Bills billNamePK = new Bills();
        ArrayList<Bills> bill = new ArrayList<Bills>();

        int numBills = 0;

        //Bills b1 = new setBill(402.00, "Car");

        DecimalFormat df = new DecimalFormat();  // sets DecimalFormat Class
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);          // makes it so using this format forces 2 places after decimal

        System.out.print("Enter Checking Account Amount: ");
        checkingAcct.setCheckingAcct(userInput.nextFloat());
        System.out.println("You have " + df.format(checkingAcct.getCheckingAcct()) + " in your Checking Account.");

        System.out.print("Enter Savings Account Amount: ");
        savingsAcct.setSavingsAcct(userInput.nextFloat());
        System.out.println("You have " + df.format(savingsAcct.getSavingsAcct()) + " in your Savings Account.");

        System.out.print("\n");

        System.out.print("Enter a bill name here: ");
        String billNameInput = userInput.next();
        System.out.print("Enter how much to pay " + billNameInput + " this month: ");
        Double billPayInput = userInput.nextDouble();

        //System.out.println("Do you have any bills to add (Y or N): ");
        //String moreBills = userInput.next();

        billNamePK.setBill(billPayInput, billNameInput);
        bill.add(billNamePK);

        /*
        billName.add(userInput.next());
        billPay.add(userInput.nextFloat());
        */

        totalAcct.setTotalAcct(checkingAcct.getCheckingAcct() + savingsAcct.getSavingsAcct());
        System.out.println("You have $" + df.format(totalAcct.getTotalAcct()) + " in your accounts.");

        Iterator itr = bill.iterator();

        while (itr.hasNext()) {
            Bills b = (Bills)itr.next();
            System.out.println("You owe $" + df.format(b.getBillExpense()) + " on " + b.getBillName());
        }

        //System.out.println("You owe " + billPay + " on " + billPay.size() + " bills.");

    }

}