/**
 * Created by Paul.Kates on 5/1/2017.
 */
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Account checkingAcct = new Account();
        Account savingsAcct = new Account();
        Account totalAcct = new Account();

        ArrayList<String> billName = new ArrayList<String>();
        ArrayList<Float> billPay = new ArrayList<Float>();

        DecimalFormat df = new DecimalFormat();  // sets DecimalFormat Class
        df.setMaximumFractionDigits(2);          // makes it so using this format forces 2 places after decimal

        System.out.print("Enter Checking Account Amount: ");
        checkingAcct.setCheckingAcct(userInput.nextFloat());
        System.out.println("You have " + df.format(checkingAcct.getCheckingAcct()) + " in your Checking Account.");

        System.out.print("Enter Savings Account Amount: ");
        savingsAcct.setSavingsAcct(userInput.nextFloat());
        System.out.println("You have " + df.format(savingsAcct.getSavingsAcct()) + " in your Savings Account.");

        System.out.print("\n");

        System.out.print("Enter a bill name here: ");
        billName.add(userInput.next());
        System.out.print("Enter how much to pay " + billName + " this month: ");
        billPay.add(userInput.nextFloat());

        totalAcct.setTotalAcct(checkingAcct.getCheckingAcct() + savingsAcct.getSavingsAcct());
        System.out.println("You have $" + df.format(totalAcct.getTotalAcct()) + " in your accounts.");

        System.out.println("You owe " + billPay + " on " + billPay.size() + " bills.");

    }

}